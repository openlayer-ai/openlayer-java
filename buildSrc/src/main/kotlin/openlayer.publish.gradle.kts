import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.get
import com.vanniktech.maven.publish.JavaLibrary
import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    signAllPublications()
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    this.coordinates(project.group.toString(), project.name, project.version.toString())

    pom {
        name.set("Openlayer API")
        description.set("API for interacting with the Openlayer server.")
        url.set("https://openlayer.com/docs/api-reference/rest/overview")

        licenses {
            license {
                name.set("Apache-2.0")
            }
        }

        developers {
            developer {
                name.set("Openlayer")
                email.set("support@openlayer.com")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/openlayer-ai/openlayer-java.git")
            developerConnection.set("scm:git:git://github.com/openlayer-ai/openlayer-java.git")
            url.set("https://github.com/openlayer-ai/openlayer-java")
        }
    }
}
