package com.example.lunchroulette.activities

import android.graphics.Color
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lunchroulette.Adapter.RestaurantAdapter
import com.example.lunchroulette.R
import com.example.lunchroulette.model.Restaurant
import com.example.lunchroulette.service.FoodService
import kotlinx.android.synthetic.main.activity_food.*

class FoodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        val fsc = FoodService()

        val restaurants = fsc.makeCall()

        val adapter = RestaurantAdapter(this, restaurants)
        rv_resturant.adapter = adapter
        rv_resturant.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        //todo*******

        food_activity_spin_button.setOnClickListener {
            startLoop(adapter, restaurants)
            // Toast.makeText(this,"button 1 clicked", Toast.LENGTH_SHORT).show()

        }
    }

    fun startLoop(adapter: RestaurantAdapter, restaurants : List<Restaurant>) {
        var randomIndex = adapter.randomResturantIndex()

        var counter = 0

        for(r in 0..randomIndex * 5) {

            for (i in restaurants.indices) {
                rv_resturant.layoutManager!!.findViewByPosition(i)!!
                    .findViewById<LinearLayout>(R.id.llItem).setBackgroundColor(
                        Color.WHITE
                    )
            }

            if (counter == restaurants.size || ) {
                counter = 0;
            }

            rv_resturant.layoutManager!!.findViewByPosition(counter)!!
                .findViewById<LinearLayout>(R.id.llItem).setBackgroundColor(
                    Color.BLUE
                )

            //TODO: wait 0.5 s
        }
    }
}

    fun main() {
        val fsc = FoodService()
        val restaurants = fsc.makeCall()
        for (i in restaurants) {

        }
    }
