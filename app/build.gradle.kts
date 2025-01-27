plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
}

android {
    namespace = "com.appupdater.maunghtun"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.appupdater.maunghtun"
        minSdk = 24
        targetSdk = 34
        versionCode = 9
        versionName = "1.0.9"

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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

publishing {
    publications {
        create<MavenPublication>("release") {
//            from(components["release"])
            groupId = "com.github.phyomghtun"
            artifactId = "AppUpdater"
            version = "1.0.8"
        }
    }
    repositories {
        maven {
            url = uri("https://jitpack.io")
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
    implementation(project(":appUpdater"))
//    implementation("com.github.phyomghtun:AppUpdateChecker:1.0.8")
}