package com.example.dviveapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class SignIn_Actvity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_actvity)




        val signup_tx = findViewById(R.id.signup_tx) as LinearLayout
        val login_tx = findViewById(R.id.login_tx) as LinearLayout


        signup_tx.setOnClickListener {
            startActivity(Intent(this,Sign_Up_Activity::class.java))
        }


        login_tx.setOnClickListener {
            startActivity(Intent(this,SignIn_Actvity::class.java))
        }


    }

}