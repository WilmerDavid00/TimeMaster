package com.example.timemaster

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn_inicio: Button = findViewById<Button>(R.id.btn_start)

        btn_inicio.setOnClickListener{
            val inicio: Intent = Intent(this,MainActivity2::class.java)
            startActivity(inicio)
        }

    }
}