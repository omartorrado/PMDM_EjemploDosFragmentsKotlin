package com.ejemplos.dam.dosfragments

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

/**
 * Clase creada para trabajar con Kotlin
 * utiliza el layout activity_main que contiene al fragment referenciado con la clase MainFragment
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
