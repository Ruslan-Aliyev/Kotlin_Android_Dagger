package com.example.kotlin_android_dagger

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var dependency: Dependency

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerApplicationComponent.builder().build().inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var testTextField = findViewById(R.id.test_text_field) as TextView
        testTextField.text = dependency.testText
    }
}