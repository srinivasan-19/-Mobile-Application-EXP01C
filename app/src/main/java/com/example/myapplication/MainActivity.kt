package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val weight : TextView = findViewById(R.id.weight)
        val height : TextView = findViewById(R.id.height)
        val CM : RadioButton = findViewById(R.id.CM)
        val Meter : RadioButton = findViewById(R.id.Meter)
        val Calculate : Button = findViewById(R.id.Calculate)
        val result : TextView = findViewById(R.id.result)

        Calculate.setOnClickListener {


            val weightValue = weight.text.toString().toFloat()
            var heightValue = height.text.toString().toFloat()

            if (CM.isChecked) {
                heightValue /= 100
            }

            if (Meter.isChecked) {
                heightValue = heightValue

            }

            val bmi = weightValue / (heightValue * heightValue)

            result.text = String.format("%.2f Kg/m²", bmi)
        }
    }
}
