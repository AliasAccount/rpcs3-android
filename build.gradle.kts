// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.compose.compiler) apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "1.7.10" apply false
}
subprojects {
    afterEvaluate {
        if (plugins.hasPlugin("com.android.application") || plugins.hasPlugin("com.android.library")) {
            dependencies {
                implementation("androidx.compose.material:material-icons-extended:$compose_version")
            }
        }
    }
}
