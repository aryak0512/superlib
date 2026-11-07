plugins {
    `java-library`
    `maven-publish`
}

dependencies {
    api(project(":superlib-spring-boot-autoconfigure"))
    api("org.springframework.boot:spring-boot-starter:${rootProject.property("springBootVersion")}")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
}
