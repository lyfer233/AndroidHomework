package com.example.imapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()                    //隐藏标题栏
        setContentView(R.layout.activity_login2)
        val buttonLogin : Button = findViewById(R.id.buttonLogin)
        buttonLogin.setOnClickListener{
            var key = 0
            val userName : EditText = findViewById(R.id.editTextTextPersonName)
            val password : EditText = findViewById(R.id.editTextTextPassword)
            password.toString()
            print(password)
            if (key == 1){
                val intent = Intent(this, mainfirst::class.java)
                startActivity(intent)
                finish()
            }
            else{

            }
        }
    }
}