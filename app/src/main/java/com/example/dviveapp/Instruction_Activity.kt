package com.example.dviveapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class Instruction_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instruction)

        val login_tx = findViewById(R.id.login_tx) as LinearLayout
        val signup_tx = findViewById(R.id.signup_tx) as LinearLayout

        val viewPager = findViewById(R.id.viewpager) as ViewPager
        val adapter = Splash_Adapter(supportFragmentManager)
        val dots_indicator = findViewById(R.id.dots_indicator) as DotsIndicator

        adapter.add(First_Fragment(),"")
        adapter.add(Second_Fragment(),"")
        adapter.add(Third_Fragment(),"")

        viewPager.adapter = adapter

        dots_indicator.attachTo(viewPager)


        login_tx.setOnClickListener {
            startActivity(Intent(this,SignIn_Actvity::class.java))
        }

        signup_tx.setOnClickListener {
            startActivity(Intent(this,Sign_Up_Activity::class.java))
        }





    }
}