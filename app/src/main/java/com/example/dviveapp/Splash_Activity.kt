package com.example.dviveapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import java.util.prefs.Preferences

class Splash_Activity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)







            val intent = Intent(this, Instruction_Activity::class.java)
            startActivity(intent)
            finish()




    }


}