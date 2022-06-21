package com.example.atividade_04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLogin = findViewById<Button>(R.id.button_login)

        buttonLogin.setOnClickListener {
            startActivity(Intent(this, Listagem::class.java))
        }

        val buttonCadrasto = findViewById<Button>(R.id.button_cadastro)

        buttonCadrasto.setOnClickListener {
            startActivity(Intent(this, Cadastro::class.java))
        }
    }
}