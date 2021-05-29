package com.example.imapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class signActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()                    //隐藏标题栏
        setContentView(R.layout.activity_sign)
    }
}