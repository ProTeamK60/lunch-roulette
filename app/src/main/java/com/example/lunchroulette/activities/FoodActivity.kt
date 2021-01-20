package com.example.lunchroulette.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lunchroulette.Adapter.ResturantAdapter
import com.example.lunchroulette.R
import com.example.lunchroulette.service.FoodService
import kotlinx.android.synthetic.main.activity_food.*

class FoodActivity : AppCompatActivity() {

    override fun  onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        val fsc = FoodService()

        val restaurants = fsc.makeCall()

        val adapter = ResturantAdapter(this, restaurants)
        rv_resturant.adapter = adapter
        rv_resturant.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        food_activity_spin_button.setOnClickListener{
            Toast.makeText(this, "yoy clicked on buttun", Toast.LENGTH_SHORT).show()
        }
    }
}