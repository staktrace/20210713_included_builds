import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.32"
}

group = "com.squareup.test.project_a"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.squareup.test.project_b:project_b:1.0")
    testImplementation(kotlin("test-junit"))
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}