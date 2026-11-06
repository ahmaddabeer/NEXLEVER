plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)

    id("org.jetbrains.kotlin.plugin.serialization") version "2.4.21"
    id("com.google.devtools.ksp") version "2.3.5"
}

android {
    namespace = "com.example.nexlever"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.example.nexlever"
        minSdk = 31
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = true
                packageScope = setOf("androidx.**", "kotlin.**", "kotlinx.**")
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
    debugImplementation(libs.androidx.compose.ui.tooling)


    // Navigation in Jetpack Compose
    implementation("androidx.navigation:navigation-compose:2.10.2")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.11.0")

    // Room
    implementation("androidx.room:room-runtime:2.8.5")
//    ksp("androidx.room:room-compiler:2.8.5")

    //coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.11.0")

    //Extra icons
    implementation("androidx.compose.material:material-icons-core")
    implementation("androidx.compose.material:material-icons-extended")


    // Coil for Jetpack Compose
    implementation("io.coil-kt.coil3:coil-compose:3.6.3")
    implementation("io.coil-kt:coil-svg:2.7.0")
    implementation("androidx.activity:activity-ktx:1.9.3")
    implementation("io.coil-kt:coil-compose:2.7.0")

    //Splash Screen
    implementation("androidx.core:core-splashscreen:1.2.0")

    //Media dependencies

    implementation("androidx.media3:media3-exoplayer:1.4.1") // Or your desired version
    implementation("androidx.media3:media3-ui:1.4.1")


    //Splash Screen
    implementation("androidx.core:core-splashscreen:1.2.0")
}