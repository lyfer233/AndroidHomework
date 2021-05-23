package com.example.imapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //val decorView = window.decorView
        //decorView.systemUiVisibility=
        //    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        //    or View.SYSTEM_UI_FLAG_LAYOUT_STABLE


        setContentView(R.layout.activity_main)
        val buttonIn: Button = findViewById(R.id.button1)
        buttonIn.setOnClickListener{
            val intent = Intent(this, LoginActivity2::class.java)
            startActivity(intent)
            //finish()
        }
    }
}