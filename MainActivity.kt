package com.example.android01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title="Bottom AppBar"
        val act2=findViewById<MaterialButton>(R.id.button_1)
        act2.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}