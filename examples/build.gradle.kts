plugins {
    id("application")
    id("openlayer.java")
}

dependencies {
    implementation(project(":openlayer-java"))
}

// Dynamically create a task for each example
val examples = listOf("StreamData") // Add the names of your example classes here

examples.forEach { example ->
    tasks.create("run$example", org.gradle.api.tasks.JavaExec::class.java) {
        group = "Examples"
        description = "Run $example"
        classpath = sourceSets.getByName("main").runtimeClasspath
        mainClass.set("com.openlayer.api.example.$example")
    }
}