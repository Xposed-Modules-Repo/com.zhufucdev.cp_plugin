plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.ksp)
    alias(libs.plugins.serialization)
}

android {
    namespace = "com.zhufucdev.cp_plugin"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.zhufucdev.cp_plugin"
        minSdk = 24
        targetSdk = 34
        versionCode = 3
        versionName = "1.2.2"

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
    buildFeatures {
        buildConfig = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.kotlin.reflect)
    // Xposed
    ksp(libs.yuki.ksp)
    implementation(libs.yuki.api)
    compileOnly(libs.xposed.api)
    // Internal
    implementation(libs.me.stub)
    implementation(libs.me.plugin)
    implementation(libs.me.xposed)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}