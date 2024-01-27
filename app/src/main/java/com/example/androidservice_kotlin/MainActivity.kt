package com.example.androidservice_kotlin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.androidservice_kotlin.service.MusicService

class MainActivity : AppCompatActivity() {
    lateinit var btn1: Button
    lateinit var btn2: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)


        btn1.setOnClickListener {
            Toast.makeText(this ,"Clicked" , Toast.LENGTH_SHORT ).show()
            val i = Intent(this , MusicService::class.java)
            startService(i)
        }

        btn2.setOnClickListener {
            val i = Intent(this , MusicService::class.java)
            stopService(i)
        }





    }
}