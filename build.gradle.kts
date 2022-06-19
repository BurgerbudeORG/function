plugins {
    id("java")
    id("maven-publish")
    id("net.kyori.indra.license-header") version "2.1.1"
}

group = "org.burgerbude.libraries"
version = System.getenv().getOrDefault("VERSION", "0.0.0")

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
    withSourcesJar()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = project.group.toString();
            artifactId = project.name;
            version = project.version.toString();

            from(components["java"])
        }

        repositories {
            maven("https://maven.burgerbude.org/api/v1/maven/upload") {
                name = "burgerbude"

                authentication {
                    create<HttpHeaderAuthentication>("header")
                }

                credentials(HttpHeaderCredentials::class) {
                    name = "Publish-Token"
                    value = System.getenv("PUBLISH_TOKEN")
                }
            }
        }
    }

}