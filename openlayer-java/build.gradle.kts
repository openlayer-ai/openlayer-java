plugins {
    id("openlayer.kotlin")
    id("openlayer.publish")
}

dependencies {
    api(project(":openlayer-java-client-okhttp"))
}
