plugins {
    id("application")
    id("openlayer.java")
}

dependencies {
    implementation(project(":openlayer-java"))
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

application {
    mainClass.set("com.openlayer.api.example.Main")
}