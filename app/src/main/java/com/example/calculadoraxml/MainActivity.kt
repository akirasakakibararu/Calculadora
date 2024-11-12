package com.example.calculadoraxml

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText : EditText = findViewById(R.id.editTextNumberDecimal)
        val button_0 : Button = findViewById(R.id.button0)
        val button_1 : Button = findViewById(R.id.button1)
        val button_2 : Button = findViewById(R.id.button2)
        val button_3 : Button = findViewById(R.id.button3)
        val button_4 : Button = findViewById(R.id.button4)
        val button_5 : Button = findViewById(R.id.button5)
        val button_6 : Button = findViewById(R.id.button6)
        val button_7 : Button = findViewById(R.id.button7)
        val button_8 : Button = findViewById(R.id.button8)
        val button_9 : Button = findViewById(R.id.button9)
        val button_ac : Button = findViewById(R.id.buttonAC)

        // Asignar acción a cada botón de número
        button_0.setOnClickListener { editText.append("0") }
        button_1.setOnClickListener { editText.append("1") }
        button_2.setOnClickListener { editText.append("2") }
        button_3.setOnClickListener { editText.append("3") }
        button_4.setOnClickListener { editText.append("4") }
        button_5.setOnClickListener { editText.append("5") }
        button_6.setOnClickListener { editText.append("6") }
        button_7.setOnClickListener { editText.append("7") }
        button_8.setOnClickListener { editText.append("8") }
        button_9.setOnClickListener { editText.append("9") }

        // Acción para el botón AC (borrar todo)
        button_ac.setOnClickListener { editText.text.clear() }
    }
}