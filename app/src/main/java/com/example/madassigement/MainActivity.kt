package com.example.madassigement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1 = findViewById<Button>(R.id.Clickme)
        button1.setOnClickListener{
            val intent1 = Intent(this,Login::class.java)
            startActivity(intent1)
        }
    }
}