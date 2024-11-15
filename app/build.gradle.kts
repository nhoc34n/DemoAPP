// File: app/build.gradle.kts (App-level)
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    alias(libs.plugins.google.gms.google.services)
}

android {
    aaptOptions {
        ignoreAssetsPattern = "!*.xml" // Corrected syntax
    }
    namespace = "com.example.swadeshibazar"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.swadeshibazar"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }


    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildToolsVersion = "34.0.0"
}

dependencies {
    implementation("androidx.core:core-ktx:1.10.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.recyclerview:recyclerview:1.2.1")
    implementation("com.google.android.gms:play-services-base:18.1.0")
    implementation("com.google.android.gms:play-services-auth:20.5.0")
    implementation("androidx.recyclerview:recyclerview:1.3.0")
    implementation("androidx.recyclerview:recyclerview:1.3.0")
    implementation(libs.activity)
    // Remove or fix the below line based on what "libs.activity" refers to
    // implementation(libs.activity)
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    // Import the BoM for the Firebase platform
    implementation(platform("com.google.firebase:firebase-bom:33.5.1"))

    // Add the dependency for the Firebase Authentication library
    // When using the BoM, you don't specify versions in Firebase library dependencies
    implementation("com.google.firebase:firebase-auth:23.1.0")

}
