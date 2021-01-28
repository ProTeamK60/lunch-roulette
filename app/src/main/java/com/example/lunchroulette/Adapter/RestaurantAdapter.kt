package com.example.lunchroulette.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lunchroulette.R
import com.example.lunchroulette.model.Restaurant
import kotlinx.android.synthetic.main.resturant_row_item.view.*

class RestaurantAdapter(var context: Context, var items: List<Restaurant>) :
    RecyclerView.Adapter<RestaurantAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        return MyViewHolder(
            LayoutInflater.from(context).inflate(R.layout.resturant_row_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.restaurant_row_name.text = items[position].name
        //holder.itemView.restaurant_row_name.background = items[position].name
    }

    fun randomResturantBgcolorTest():Int {
        var number = (Math.random() * 5).toInt()
        if(number==5){
            number=4
        }
        return number
    }

    override fun getItemCount(): Int {
        return items.size;
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        lateinit var myTextView : TextView

        fun bindElementsToView(position: Int, ){

        }

    }
}

fun main() {
    for (i in 1..10) {
        print((Math.random() * 5).toInt())
    }
}