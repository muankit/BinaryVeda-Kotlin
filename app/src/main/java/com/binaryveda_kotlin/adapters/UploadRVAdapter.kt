package com.binaryveda_kotlin.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.binaryveda_kotlin.R
import com.binaryveda_kotlin.models.Upload
import kotlinx.android.synthetic.main.upload_item_layout.view.*

class UploadRVAdapter (private val item: ArrayList<Upload>) : RecyclerView.Adapter<UploadRVAdapter.UploadViewHolder>(){

    class UploadViewHolder (view : View) : RecyclerView.ViewHolder(view) {
        fun bind(upload: Upload) {
            itemView.item_upload_image.setImageResource(upload.imageId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UploadViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.upload_item_layout, parent, false)
        return UploadViewHolder(view)
    }

    override fun onBindViewHolder(holder: UploadViewHolder, position: Int) {
        holder.bind(item[position])
    }

    override fun getItemCount(): Int {
        return item.size
    }
}