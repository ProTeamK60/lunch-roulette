package com.example.lunchroulette.service

import com.example.lunchroulette.model.Restaurant

class FoodService {
    private lateinit var restaurants : Restaurant

    fun makeCall() : ArrayList<Restaurant>{

        val restaurant = Restaurant("ChinaResturant", 1.2, "Solna")
        val restaurant1 = Restaurant("ThaiResturant", 1.2, "Solna")
        val restaurant2 = Restaurant("SvenskResturant", 1.5, "Högdalen")
        val restaurant3 = Restaurant("AmericanResturant", 2.2, "Spånga")
        val restaurant4 = Restaurant("BritishResturant", 1.3, "Kista")

      return arrayListOf(restaurant, restaurant1, restaurant2, restaurant3, restaurant4)
    }
}