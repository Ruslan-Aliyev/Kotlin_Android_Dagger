package com.example.kotlin_android_dagger

import javax.inject.Inject

class Dependency @Inject constructor() {
    var testText = "Test Text"
}