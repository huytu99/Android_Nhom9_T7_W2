package com.example.android_week2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class BoardingTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boarding_two)

        val btnNext = findViewById<ImageButton>(R.id.btn_next)
        btnNext.setOnClickListener {
            val intent = Intent(this,
                BoardingThreeActivity::class.java)
            startActivity(intent)
        }
    }
}