package com.example.gametesterapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var gameText: TextView
    private lateinit var studentText: TextView
    private lateinit var startButton: Button
    private lateinit var exitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // Input UI Elements here
        gameText = findViewById(R.id.gameText)
        studentText = findViewById(R.id.studentText)
        startButton = findViewById(R.id.startButton)
        exitButton = findViewById(R.id.exitButton)

        // Set the start button here on click listener
        startButton.setOnClickListener{
         val intent = Intent(this,MainInputScreenActivity::class.java)
            startActivity(intent)
        }

        // Set the exit button here on click listener
        exitButton.setOnClickListener{
            finishAffinity()
        }






    }
}