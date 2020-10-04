package com.example.paisesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class Datos : AppCompatActivity() {

    var tvPais: TextView? = null
    var tvCapital: TextView? = null
    var tvExtension: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvPais = findViewById(R.id.txtNombre)
        tvCapital = findViewById(R.id.txtCapital)
        tvExtension = findViewById(R.id.txtExtension)

        val paisData = intent.getStringExtra("com.estudio.paisesapp.ActivityMenu.CIUDAD")
        Toast.makeText(this, paisData, Toast.LENGTH_SHORT).show()

        val paisHonduras = Pais("Honduras", "Tegucigalpa", 112492)
        val paisGuatemala = Pais("Guatemala", "Ciudad de Guatemala", 108889)
        val paisElSalva = Pais(("El Salvador", "San Salvador", 21041)
        val paisNicaragua = Pais("Nicaragua", "Managua", 130373)
        val paisCR = Pais("Costa Rica", "San José", 51100)

        if(paisData == "País: Honduras"){
            tvPais?.text = paisHonduras.nombre
            tvCapital?.text = paisHonduras.capital
            tvExtension?.text = paisHonduras.extension.toString() + "km2"
        } else if (paisData == "País: Guatemala"){
            tvPais?.text = paisGuatemala.nombre
            tvCapital?.text = paisGuatemala.capital
            tvExtension?.text = paisGuatemala.extension.toString() + "km2"
        } else if (paisData == "País: El Salvador"){
            tvPais?.text = paisElSalva.nombre
            tvCapital?.text = paisElSalva.capital
            tvExtension?.text = paisElSalva.extension.toString() + "km2"
        } else if (paisData == "País: Nicargua"){
            tvPais?.text = paisNicaragua.nombre
            tvCapital?.text = paisNicaragua.capital
            tvExtension?.text = paisNicaragua.extension.toString() + "km2"
        } else if (paisData == "País: Costa Rica"){
            tvPais?.text = paisCR.nombre
            tvCapital?.text = paisCR.capital
            tvExtension?.text = paisCR.extension.toString() + "km2"

    }
}