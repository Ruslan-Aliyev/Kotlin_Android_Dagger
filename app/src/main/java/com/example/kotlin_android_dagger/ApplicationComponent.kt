package com.example.kotlin_android_dagger

import dagger.Component

@Component
interface ApplicationComponent {
    fun inject(activity: MainActivity)
}
