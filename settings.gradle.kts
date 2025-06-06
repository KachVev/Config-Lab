pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
        mavenCentral()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "Config-lab"
include("config-annotations")
include("config-core")
include("config-example")

include("config-format")
include("config-format:config-format-yaml")

include("sensitive-plugin")
include("sensitive-plugin:gradle-plugin")
include("sensitive-plugin:kotlin-plugin")
include("config-format:config-format-json")