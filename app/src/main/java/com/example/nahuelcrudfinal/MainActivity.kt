package com.example.nahuelcrudfinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    private lateinit var referencia : DatabaseReference

    private lateinit var botonCrear: Button
    private lateinit var botonListar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botonCrear = findViewById(R.id.crear)
        botonListar = findViewById(R.id.listar)


        botonCrear.setOnClickListener {
            val intent = Intent(this, AnadirSerie::class.java)
            startActivity(intent)
        }

        botonListar.setOnClickListener {
            val intent = Intent(this, Serie::class.java)
            startActivity(intent)
        }

        referencia = FirebaseDatabase.getInstance().getReference()
        var identificador = referencia.child("series").push().key!!

        var nuevaSerie = Serie("1234", "Shingeki", "2012 a 2023")

        referencia.child("series").child(identificador).push()
            .setValue(nuevaSerie)


    }
}