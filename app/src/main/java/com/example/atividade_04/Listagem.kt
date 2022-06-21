package com.example.atividade_04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Listagem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listagem)

        val buttonSair = findViewById<Button>(R.id.button_sair)

        buttonSair.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}