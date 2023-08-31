package com.example.crashlyticstest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val crashButton = findViewById<Button>(R.id.push_to_crash)
        crashButton.text = "Test Crash"
        crashButton.setOnClickListener {
            Log.d("crash","app crash")

            throw RuntimeException("Test Crash")
        }
    }
}