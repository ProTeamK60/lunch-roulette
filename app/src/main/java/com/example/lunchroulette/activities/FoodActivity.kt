package com.example.lunchroulette.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lunchroulette.R
import com.example.lunchroulette.service.FoodService
import kotlinx.android.synthetic.main.activity_food.*

class FoodActivity : AppCompatActivity() {

    override fun  onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)
        FoodService.makeCall()
        food_activity_spin_button.setOnClickListener{
            Toast.makeText(this, "yoy clicked on buttun", Toast.LENGTH_SHORT).show()
        }
    }
}