description = "A lightweight typesafe GraphQL HTTP Client"

val ktorVersion: String by project
val wireMockVersion: String by project

dependencies {
    api(project(path = ":graphql-kotlin-client"))
    api("io.ktor:ktor-client-cio:$ktorVersion")
    api("io.ktor:ktor-client-jackson:$ktorVersion")
    testImplementation("io.ktor:ktor-client-okhttp:$ktorVersion")
    testImplementation("io.ktor:ktor-client-logging:$ktorVersion")
    testImplementation("com.github.tomakehurst:wiremock-jre8:$wireMockVersion")
}
