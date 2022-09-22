package com.example.dviveapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class Sign_Up_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        val login_tx = findViewById(R.id.login_tx) as LinearLayout
        val btn_send_code = findViewById(R.id.btn_send_code) as LinearLayout



        btn_send_code.setOnClickListener {
            startActivity(Intent(this,OTP_Authentication_Activity::class.java))
        }




        login_tx.setOnClickListener {
            startActivity(Intent(this,SignIn_Actvity::class.java))
        }

    }
}