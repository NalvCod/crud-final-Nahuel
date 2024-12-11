package com.example.nahuelcrudfinal

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AnadirSerie : AppCompatActivity() {
    private lateinit var spinnerGenero: Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anadir_serie)




            setContentView(R.layout.activity_anadir_serie)

            spinnerGenero = findViewById(R.id.spinner_genero)

            // Lista de géneros de series
            val generos = listOf(
                "Acción", "Aventura", "Ciencia ficción", "Comedia",
                "Drama", "Romance", "Terror", "Suspenso",
                "Fantasía", "Documental", "Animación"
            )

            // Configurar el adaptador para el Spinner
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, generos)
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerGenero.adapter = adapter
        }
    }



