package com.example.atividade_04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val buttonSeCadastrar = findViewById<Button>(R.id.button_secadastrar)

        buttonSeCadastrar.setOnClickListener {
            startActivity(Intent(this, Listagem::class.java))
        }
    }
}