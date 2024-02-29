package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    private var clickCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewHelloWorld: TextView = findViewById(R.id.text_view_hello_world)
        val buttonIncrement: Button = findViewById(R.id.button_increment)
        val textViewClickCount: TextView = findViewById(R.id.text_view_click_count)

        buttonIncrement.setOnClickListener {
            clickCount++
            textViewHelloWorld.text = getString(R.string.hello_world) + " +" + "$clickCount"
            textViewClickCount.text = "Ilość przywitań: $clickCount"
        }
    }
}