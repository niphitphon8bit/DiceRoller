package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_btn)
        val countUpBtn: Button = findViewById(R.id.count_up_btn)
        countUpBtn.setOnClickListener{countUp()}
        rollButton.setOnClickListener{rollDice()}

    }

    private fun rollDice(){
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
        Toast.makeText(this, "button clicked",
        Toast.LENGTH_SHORT).show()
    }

    private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)
        if(resultText.text.toString() == "Hello World!") {
            resultText.text = "1"
        }else if(resultText.text.toString() != "6"){
            var number = Integer.parseInt(resultText.text.toString())
            number += 1
            resultText.text = number.toString()
        }
    }
}