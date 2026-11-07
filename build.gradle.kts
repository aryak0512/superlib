plugins {
    base
}

group = "com.aryak"
version = "1.0.0-SNAPSHOT"
extra["springBootVersion"] = "4.1.2"

allprojects {
    group = rootProject.group
    version = rootProject.version

    repositories {
        mavenCentral()
    }
}

subprojects {
    tasks.withType<JavaCompile>().configureEach {
        options.release.set(25)
        options.encoding = "UTF-8"
    }
}
