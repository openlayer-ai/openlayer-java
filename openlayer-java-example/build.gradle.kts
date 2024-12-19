plugins {
    id("openlayer.kotlin")
    id("java")
    application
}

dependencies {
    implementation(project(":openlayer-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    mainClass = "com.openlayer.api.example.Main"
}
