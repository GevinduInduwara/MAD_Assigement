package com.example.madassigement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var button1 = findViewById<Button>(R.id.blogin2)
        button1.setOnClickListener{
            val intent1 = Intent(this,Signup::class.java)
            startActivity(intent1)
        }
    }
}