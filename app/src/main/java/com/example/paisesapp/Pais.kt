package com.example.paisesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Pais (nombre:String, capital:String, extension:Int) {
    var nombre:String = ""
    var capital:String = ""
    var extension:Int = 0

    init {
        this.nombre = nombre
        this.capital = capital
        this.extension = extension
    }
}