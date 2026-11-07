plugins {
    `java-library`
    `maven-publish`
}

dependencies {
    api(project(":superlib-core"))
    api("org.springframework.boot:spring-boot-autoconfigure:${rootProject.property("springBootVersion")}")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
}
