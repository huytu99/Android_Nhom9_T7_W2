package com.example.android_week2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.ceslab.androidchallengew2.model.User
import com.google.android.material.button.MaterialButton

class SignUpActivity : AppCompatActivity() {


    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnSignIn: MaterialButton
    private lateinit var btnSignUp: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btnSignIn = findViewById<TextView>(R.id.btn_sign_in)
        btnSignIn.setOnClickListener {
            val intent = Intent(this,
                SignInActivity::class.java)
            startActivity(intent)
        }
    }

}