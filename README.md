# Superlib

Superlib is a Gradle multi-project library with a framework-independent core and
Spring Boot starter modules. It targets Java 17 and Spring Boot 3.5.

## Modules

- `superlib-core`: framework-independent library code.
- `superlib-spring-boot-autoconfigure`: Spring Boot auto-configuration; add
  library beans and configuration here.
- `superlib-spring-boot-starter`: dependency bundle for Spring Boot consumers.

## Build and publish locally

```shell
./gradlew build
./gradlew publishToMavenLocal
```

In another Gradle Spring Boot project, add Maven Local and the starter:

```kotlin
repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("com.aryak:superlib-spring-boot-starter:1.0.0-SNAPSHOT")
}
```

The consuming project should manage Spring Boot dependencies with its Spring
Boot plugin or the `spring-boot-dependencies` BOM.
