package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/**
 * Esta actividad permite al usuario lanzar un dado y ver el resultado en la pantalla
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Creamos un objeto boton y lo vinculamos con el respectivo boton del layaut
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    /**
     * Lanzar el dado y actualizar la pantalla con el resultado
      */
    private fun rollDice() {
        //Crea un objeto Dice con 6 lados y lanzarlo
        val dice = Dice(6)
        val diceRoll = dice.roll()
        //actualiza la pantalla con el resultado del dado
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}

/**
 * Esta es una clase para crear Dados
 */
class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}