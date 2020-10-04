package com.example.paisesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val Tag = "com.estudio.paisesapp.ActivityMenu.Pais"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    class ActivityMenu : AppCompatActivity() {
        val Tag = "com.estudio.climaapp.ActivityMenu.CIUDAD"
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val btnHonduras = findViewById<Button>(R.id.btnHonduras)
            val btnGuatemala = findViewById<Button>(R.id.btnGuatemala)
            val btnElSalva = findViewById<Button>(R.id.btnElSalva)
            val btnNicaragua = findViewById<Button>(R.id.btnNicaragua)
            val btnCR = findViewById<Button>(R.id.btnCR)

            btnHonduras.setOnClickListener(View.OnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra(Tag, "País: Honduras")
                startActivity(intent)
            })
            btnGuatemala.setOnClickListener(View.OnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra(Tag, "País: Gutemala")
                startActivity(intent)
            })
            btnElSalva.setOnClickListener(View.OnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra(Tag, "País: El Salvador")
                startActivity(intent)
            })
            btnNicaragua.setOnClickListener(View.OnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra(Tag, "País: Nicaragua")
                startActivity(intent)
            })
            btnCR.setOnClickListener(View.OnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra(Tag, "País: Costa Rica")
                startActivity(intent)
            })
        }
    }
}