plugins {
    kotlin("jvm") version("{{ cookiecutter.kotlin_version }}")
    id("java-library")
}


repositories {
    mavenCentral()
}


dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    testImplementation(kotlin("test"))
    testImplementation(platform("org.junit:junit-bom:{{ cookiecutter.junit_version }}"))
    {% if cookiecutter.junit_runner == "JUnit" -%}
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    {%- endif %}
}


tasks {
    wrapper {
        gradleVersion = "{{ cookiecutter.gradle_version }}"
    }

    test {
        {% if cookiecutter.junit_runner == "JUnit" -%}
        useJUnitPlatform()  // use the JUnit test runner instead of Gradle
        {%- endif %}
    }
}
