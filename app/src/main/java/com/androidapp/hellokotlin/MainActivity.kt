package com.androidapp.hellokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

//    val btnHello = findViewById<Button>(R.id.btnJava) //Val 상수, 불변 변수


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // var btnHello : Button  //Var 일반적인 변수
        // btnHello = findViewById(R.id.btnHello)
        val btnJava = findViewById<Button>(R.id.btnJava)
        val btnKotlin = findViewById<Button>(R.id.btnKotlin)
        btnJava.setOnClickListener {
            intent = Intent(this@MainActivity, BmiJavaActivity::class.java)
        }
        btnKotlin.setOnClickListener {
            intent = Intent(this@MainActivity, BmiKotlinActivity :: class.java)
        }
    }
}