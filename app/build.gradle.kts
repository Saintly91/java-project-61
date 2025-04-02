plugins {
    id("com.github.ben-manes.versions") version "0.52.0"
    id("application")
    id("org.sonarqube") version "6.0.1.5171"
    id("checkstyle")
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

application {
    mainClass = "hexlet.code.App"
}

sonar {
    properties {
        property("sonar.projectKey", "Saintly91_java-project-61")
        property("sonar.organization", "saintly91")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}