package com.example.imapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()                    //隐藏标题栏
        setContentView(R.layout.activity_main)
        val dbHelper = MyDatabaseHelper(this, "SignList.db", 1)
        dbHelper.writableDatabase
        val buttonIn: Button = findViewById(R.id.button1)
        buttonIn.setOnClickListener{
            val intent = Intent(this, LoginActivity2::class.java)
            startActivity(intent)
            finish()
        }
    }
}