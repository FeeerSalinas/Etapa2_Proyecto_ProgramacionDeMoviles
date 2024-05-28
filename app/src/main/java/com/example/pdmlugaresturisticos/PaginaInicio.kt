package com.example.pdmlugaresturisticos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class PaginaInicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_inicio)

        val btnPerfilUsuario: ImageButton = findViewById(R.id.btnPerfilUsuario)
        btnPerfilUsuario.setOnClickListener{

            val intent: Intent = Intent(this, Perfil::class.java)
            startActivity(intent)

        }

        val btnDestacados: ImageButton = findViewById(R.id.btnDestacados)
        btnDestacados.setOnClickListener{

            val intent: Intent = Intent(this, ActividadesTuristicas::class.java)
            startActivity(intent)

        }

        val btnNotificaciones: ImageButton = findViewById(R.id.btnNotificacion)
        btnNotificaciones.setOnClickListener{

            val intent: Intent = Intent(this, activity_view_actividades_turisticas::class.java)
            startActivity(intent)

        }

    }
}