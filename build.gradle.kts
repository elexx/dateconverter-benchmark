
plugins {
    java
    id("application")
}

repositories {
    jcenter()
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

application {
    mainClassName = "org.openjdk.jmh.Main"
}

dependencies {
    implementation("org.openjdk.jmh:jmh-core:1.22")
    annotationProcessor("org.openjdk.jmh:jmh-generator-annprocess:1.22")
}
