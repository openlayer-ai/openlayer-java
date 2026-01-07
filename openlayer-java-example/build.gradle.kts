plugins {
    id("openlayer.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":openlayer-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :openlayer-java-example:run` to run `Main`
    // Use `./gradlew :openlayer-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.openlayer.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
