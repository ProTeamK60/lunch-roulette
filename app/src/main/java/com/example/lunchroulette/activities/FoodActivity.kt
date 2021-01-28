package com.example.lunchroulette.activities

import android.graphics.Color
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lunchroulette.Adapter.RestaurantAdapter
import com.example.lunchroulette.R
import com.example.lunchroulette.service.FoodService
import kotlinx.android.synthetic.main.activity_food.*

class FoodActivity : AppCompatActivity() {

    override fun  onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        val fsc = FoodService()

        val restaurants = fsc.makeCall()

        val adapter = RestaurantAdapter(this, restaurants)
        rv_resturant.adapter = adapter
        rv_resturant.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        //todo*******


        food_activity_spin_button.setOnClickListener{
           startLoop(adapter)
           // Toast.makeText(this,"button 1 clicked", Toast.LENGTH_SHORT).show()

        }
    }

    fun startLoop(adapter: RestaurantAdapter) {
        var random = adapter.randomResturantBgcolorTest()
        
        rv_resturant.layoutManager!!.findViewByPosition(random)!!
            .findViewById<LinearLayout>(R.id.llItem).setBackgroundColor(
            Color.BLUE)

    }
}