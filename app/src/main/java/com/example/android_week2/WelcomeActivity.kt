package com.example.android_week2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class WelcomeActivity : AppCompatActivity() {
    private lateinit var btnStart : MaterialButton
    private lateinit var btnSignIn: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        findViewsById()
        setupViews()
    }

    private fun findViewsById(){
        btnStart = findViewById(R.id.btn_start)
        btnSignIn = findViewById(R.id.btn_sign_in)
    }

    private fun setupViews(){
        btnStart.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        btnSignIn.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}