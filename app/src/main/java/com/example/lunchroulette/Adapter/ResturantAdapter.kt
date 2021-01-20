package com.example.lunchroulette.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lunchroulette.R
import com.example.lunchroulette.model.Restaurant
import kotlinx.android.synthetic.main.resturant_row_item.view.*

class ResturantAdapter(var context: Context, var items: List<Restaurant>) :
    RecyclerView.Adapter<ResturantAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        return MyViewHolder(
            LayoutInflater.from(context).inflate(R.layout.resturant_row_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.restaurant_row_name.text = items[position].name
    }

    override fun getItemCount(): Int {
        return items.size;
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}