plugins {
    id("org.jetbrains.kotlin.jvm") version("{{ cookiecutter.kotlin_version }}")
    id("java-library")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    testImplementation(kotlin("test"))
}

tasks {
    wrapper {
        gradleVersion = "{{ cookiecutter.gradle_version }}"
    }
    test {
        useJUnitPlatform()
    }
}
