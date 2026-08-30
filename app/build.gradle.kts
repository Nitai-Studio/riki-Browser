plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.riki.nitaistudio"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.riki.nitaistudio"
        minSdk = 21
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true

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
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Multidex
    implementation("androidx.multidex:multidex:2.0.1")
    
    // Room
    implementation("androidx.room:room-runtime:2.6.1")
    
    // AndroidX Core
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.core)
    
    // Work Manager
    implementation(libs.androidx.work.rxjava2)
    implementation(libs.androidx.work.runtime.ktx)

    // Third Party Libraries
    implementation("com.github.Angtrim:Android-Five-Stars-Library:v3.1")
    implementation("com.github.satyan:sugar:1.5")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("com.squareup:otto:1.3.8")
    implementation("javax.inject:javax.inject:1")
    implementation("com.google.dagger:dagger:2.48")
    implementation("com.romainpiel.shimmer:library:1.4.0@aar")
    implementation("com.facebook.shimmer:shimmer:0.5.0")
    implementation("com.google.android.gms:play-services-ads:22.6.0")
    
    // Leanback
    implementation(libs.androidx.leanback)
    
    // User Messaging Platform
    implementation("com.google.android.ump:user-messaging-platform:2.1.0")
    
    // Kotlin BOM
    implementation(platform("org.jetbrains.kotlin:kotlin-bom:1.8.0"))
    
    // OkHttp
    implementation(libs.okhttp.logging)
    
    // Preference
    implementation("androidx.preference:preference:1.2.1")

    // Fetch2 (local AAR files)
    implementation(files(fileTree("libs") {
        include("fetch2okhttp-3.2.2.aar")
    }))
    implementation(files(fileTree("libs") {
        include("fetch2-3.2.2.aar")
    }))
    implementation(files(fileTree("libs") {
        include("fetch2core-3.2.2.aar")
    }))
    implementation(files(fileTree("libs") {
        include("fetch2rx-3.2.2.aar")
    }))

    // Other Dependencies
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    implementation("org.jsoup:jsoup:1.16.2")
    implementation("androidx.gridlayout:gridlayout:1.0.0")
    implementation("org.greenrobot:eventbus:3.3.1")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.9.0")
    implementation("com.squareup.retrofit2:converter-scalars:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("androidx.webkit:webkit:1.8.0")
    implementation("com.afollestad.material-dialogs:commons:0.9.6.0")

    // RecyclerView & Glide
    implementation(libs.androidx.recyclerview)
    implementation(libs.glide)
}
