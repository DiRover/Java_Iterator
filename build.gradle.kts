plugins {
    id("java")
}

group = "di_rover"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.jetbrains:annotations:23.0.0")
}

tasks.test {
    useJUnitPlatform()
}