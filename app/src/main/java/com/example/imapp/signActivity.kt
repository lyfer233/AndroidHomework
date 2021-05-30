package com.example.imapp

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class signActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()                    //隐藏标题栏
        setContentView(R.layout.activity_sign)
        val dbHelper = MyDatabaseHelper(this, "SignList.db", 2)
        val username : EditText = findViewById(R.id.editTextUsername)
        val password : EditText = findViewById(R.id.editTextTextPassword)
        val password2 : EditText = findViewById(R.id.editTextTextPasswordRe)
        val usernameS = username.text.toString()
        val passwordS = password.text.toString()  //转化成Sring
        val passwordS2 = password2.text.toString()
        val buttonT : Button = findViewById(R.id.buttonTrue)
        buttonT.setOnClickListener{
            if (usernameS.equals(null)) {
                Toast.makeText(this, "用户名不能为空", Toast.LENGTH_SHORT).show()
            }else if (passwordS.equals(null) || passwordS2.equals("")){
                Toast.makeText(this, "密码不能为空", Toast.LENGTH_SHORT).show()
            }else if (!passwordS.equals(passwordS2)){
                Toast.makeText(this, "两次密码并不一致", Toast.LENGTH_SHORT).show()
            }else{
                val db = dbHelper.writableDatabase
                val value = ContentValues().apply {
                    put("username", usernameS)
                    put("password", passwordS)
                }
                db.insert("List", null, value)
            }
        }
    }
}