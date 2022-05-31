plugins {
    java
    kotlin("jvm") version "1.6.21"
}

group = "org.example"
version = "1.0.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
    }
}

dependencies {
    implementation("com.apollographql.apollo3", "apollo-runtime", "3.3.0")
}
