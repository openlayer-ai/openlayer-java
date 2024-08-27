package com.openlayer.api.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public abstract class OpenlayerModel {

    public void runFromCli(String[] args) throws Exception {
        if (args.length < 2 || args.length > 4) {
            System.out.println("Usage: java YourModelClass --dataset-path <path> [--output-dir <dir>]");
            System.exit(1);
        }

        String datasetPath = null;
        String outputDir = null;

        for (int i = 0; i < args.length; i += 2) {
            if ("--dataset-path".equals(args[i])) {
                datasetPath = args[i + 1];
            } else if ("--output-dir".equals(args[i])) {
                outputDir = args[i + 1];
            }
        }

        if (datasetPath == null) {
            System.out.println("Error: --dataset-path is required");
            System.exit(1);
        }

        batch(datasetPath, outputDir);
    }

    public void batch(String datasetPath, String outputDir) throws Exception {
        List<Map<String, Object>> data = readDataset(datasetPath);
        List<Map<String, Object>> results = new ArrayList<>();

        Method runMethod = this.getClass().getMethod("run", Map.class);

        for (Map<String, Object> row : data) {
            RunReturn result = (RunReturn) runMethod.invoke(this, row);
            Map<String, Object> resultMap = new HashMap<>(row);
            resultMap.put("output", result.getOutput());
            resultMap.putAll(result.getOtherFields());
            results.add(resultMap);
        }

        Map<String, Object> config = createConfig(runMethod);
        writeOutputToDirectory(results, config, outputDir);
    }

    private List<Map<String, Object>> readDataset(String datasetPath) throws IOException {
        File file = new File(datasetPath);
        ObjectMapper mapper;

        if (datasetPath.endsWith(".csv")) {
            mapper = new CsvMapper();
            CsvSchema schema = CsvSchema.emptySchema().withHeader();
            return ((CsvMapper) mapper).readerFor(Map.class).with(schema).<Map<String, Object>>readValues(file)
                    .readAll();
        } else if (datasetPath.endsWith(".json")) {
            mapper = new ObjectMapper();
            return mapper.readValue(file, mapper.getTypeFactory().constructCollectionType(List.class, Map.class));
        } else {
            throw new IllegalArgumentException("Unsupported file format. Please use .csv or .json");
        }
    }

    private Map<String, Object> createConfig(Method runMethod) {
        Map<String, Object> config = new HashMap<>();
        config.put("outputColumnName", "output");
        config.put("inputVariableNames", Arrays.stream(runMethod.getParameters())
                .map(param -> param.getName())
                .collect(Collectors.toList()));
        config.put("metadata", Map.of("output_timestamp", System.currentTimeMillis() / 1000.0));
        return config;
    }

    private void writeOutputToDirectory(List<Map<String, Object>> results, Map<String, Object> config, String outputDir)
            throws IOException {
        if (outputDir == null) {
            outputDir = "output_" + System.currentTimeMillis();
        }

        Path dirPath = Paths.get(outputDir);
        Files.createDirectories(dirPath);

        ObjectMapper mapper = new ObjectMapper();

        // Write results
        Path datasetPath = dirPath.resolve("dataset.json");
        mapper.writeValue(datasetPath.toFile(), results);

        // Write config
        Path configPath = dirPath.resolve("config.json");
        mapper.writeValue(configPath.toFile(), config);

        System.out.println("Output written to " + dirPath.toAbsolutePath());
    }

    public abstract RunReturn run(Map<String, Object> input) throws Exception;

    public static class RunReturn {
        private final Object output;
        private final Map<String, Object> otherFields;

        public RunReturn(Object output) {
            this(output, new HashMap<>());
        }

        public RunReturn(Object output, Map<String, Object> otherFields) {
            this.output = output;
            this.otherFields = otherFields;
        }

        public Object getOutput() {
            return output;
        }

        public Map<String, Object> getOtherFields() {
            return otherFields;
        }
    }
}