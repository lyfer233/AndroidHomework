package com.example.imapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()                    //隐藏标题栏
        setContentView(R.layout.activity_login2)
        val buttonLogin : Button = findViewById(R.id.buttonLogin)
        //登录按钮事件
        buttonLogin.setOnClickListener{
            var key = 0
            val userName : EditText = findViewById(R.id.editTextTextPersonName)
            val password : EditText = findViewById(R.id.editTextTextPassword)
            if (password.text.toString().equals("xyw")){
                key = 1
            }
            if (key == 1){
                val intent = Intent(this, mainfirst::class.java)
                startActivity(intent)
                finish()
            }
            else{
                Toast.makeText(this, "密码错误", Toast.LENGTH_SHORT).show()
            }
        }
        val buttonSign : Button = findViewById(R.id.buttonSign)
        buttonSign.setOnClickListener{
            val intentS = Intent(this, signActivity::class.java)
            startActivity(intentS)
        }
    }
}