plugins {
    kotlin("jvm") version "1.8.20"
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}
repositories {
    mavenCentral()
}
kotlin {
    jvmToolchain(11)
}

task("hello").doLast {
    println("Hello world")
}