plugins {
    id("openlayer.kotlin")
    id("openlayer.publish")
}

dependencies {
    api(project(":openlayer-java-core"))

    implementation("com.squareup.okhttp3:okhttp:4.12.0")

    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.25.3")
    testImplementation("org.slf4j:slf4j-simple:2.0.12")
}
