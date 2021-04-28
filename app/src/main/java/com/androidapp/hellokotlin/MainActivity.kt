package com.androidapp.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // var btnHello : Button  //Var 일반적인 변수
        val btnHello = findViewById<Button>(R.id.btnHello) //Val 상수, 불변 변수
        // btnHello = findViewById(R.id.btnHello)
        btnHello.setOnClickListener {
            Toast.makeText(this@MainActivity, "Hello Kotlin" , Toast.LENGTH_LONG).show()
        }
    }
}