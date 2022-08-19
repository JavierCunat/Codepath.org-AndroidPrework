package com.example.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

// Kotlin file to handle UI
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //Basically reference code to .xml file
        // Display customized text to show 'Hello from {name}' (Completed)

        findViewById<Button>(R.id.button).setOnClickListener {
            // Handles button Tap
            Log.i("Javi", "Tapped on Button #1 Change Text Color") // Tag:msg logs button listener
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))

        }
        // User can press button to change color of Text (Completed)

        findViewById<Button>(R.id.button2).setOnClickListener {
            // Handles button Tap
            Log.i("Javi", "Tapped on Button #2 Change Background Color") // Tag:msg logs button listener (For Testing)
            findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.black))

        }
        // User can press button to change background Color (Completed)

        findViewById<Button>(R.id.button3).setOnClickListener {
            // Handles button Tap
            Log.i("Javi", "Tapped on Button #3 Change Main Label") // Tag:msg logs button listener (For Testing)
            findViewById<TextView>(R.id.textView).text = "Android is Awesome!"

        }
        // User can press button to change main label (Completed)

        findViewById<Button>(R.id.button4).setOnClickListener {
            // Handles button Tap
            Log.i("Javi", "Tapped on Button #4 Reset Default Settings") // Tag:msg logs button listener (For Testing)
            findViewById<TextView>(R.id.textView).text = "Hello from Javier!"
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.black))
            findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.lightblue))


        }
        // User can press button to reset all views to default settings (Completed)

        // User can use Keyboard (Completed)









    }
}