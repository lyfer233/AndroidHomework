package com.example.imapp

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

class MyDatabaseHelper(val context: Context, name: String, version: Int) :
        SQLiteOpenHelper(context, name, null, version){
            private val createB = "create table List (" +
                    "id integer primary key autoincrement," +
                    "username text," +
                    "password text)"

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(createB)
        Toast.makeText(context, "create success", Toast.LENGTH_SHORT).show()
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }

}