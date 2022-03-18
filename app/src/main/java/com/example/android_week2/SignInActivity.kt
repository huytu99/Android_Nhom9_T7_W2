package com.example.android_week2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.ceslab.androidchallengew2.model.User
import com.google.android.material.button.MaterialButton

class SignInActivity : AppCompatActivity() {

    companion object {
        const val USER_KEY = "USER_KEY"
    }

    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnSignIn: MaterialButton
    private lateinit var btnSignUp: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        findViewsById()
        setupViews()
    }

    private fun findViewsById() {
        edtEmail = findViewById(R.id.edt_email)
        edtPassword = findViewById(R.id.edt_password)
        btnSignIn = findViewById(R.id.btn_sign_in)
        btnSignUp = findViewById(R.id.btn_sign_up)
    }

    private fun setupViews() {
        val testUser =
            User("Cristiano Ronaldo", "ronaldo@gmail.com", "123456", "+84 678 287")

        btnSignIn.setOnClickListener {
            if (edtEmail.text.toString().trim() == testUser.email && edtPassword.text.toString()
                    .trim() == testUser.password
            ) {
                val bundle = Bundle()
                bundle.putParcelable(USER_KEY, testUser)
                val intent = Intent(this@SignInActivity, ProfileActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            } else {
                Toast.makeText(this@SignInActivity, "Sign in failed", Toast.LENGTH_SHORT).show()
            }
        }

        btnSignUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}