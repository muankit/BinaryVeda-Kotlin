package com.binaryveda_kotlin.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.binaryveda_kotlin.R
import com.binaryveda_kotlin.models.Home
import kotlinx.android.synthetic.main.main_item_layout.view.*

class MainRVAdapter(private val item: ArrayList<Home>) : RecyclerView.Adapter<MainRVAdapter.MainViewHolder>(){

    class MainViewHolder (view : View) : RecyclerView.ViewHolder(view) {
        fun bind(home: Home) {
            itemView.item_image_title.text = home.title
            itemView.item_image_sub_title.text = home.subTitle
            itemView.item_image_vector.setImageResource(home.imageId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_item_layout, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(item[position])
    }

    override fun getItemCount(): Int {
        return item.size
    }
}