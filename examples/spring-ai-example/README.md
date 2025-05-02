# Spring AI sample application

## Prerequisites

- Java 21+
- An Openlayer API key
- An OpenAI API key

## How to run

1. Set the environment variables.
   ```
   export SPRING_AI_OPENAI_APIKEY="sk-proj-xxx"
   export OTEL_EXPORTER_OTLP_ENDPOINT="https://api.openlayer.ai/v1/otel"
   export OTEL_EXPORTER_OTLP_HEADERS=""Authorization=Bearer YOUR_OPENLAYER_API_KEY, x-bt-parent=pipeline_id:YOUR_OPENLAYER_PIPELINE_ID""
   ```
2. Run the application with `./mvnw clean install spring-boot:run`.
3. Call the chat endpoint with `curl localhost:8080/v1/chat`.

The trace will automatically be sent to Openlayer.
