package com.example.testovoe7

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class VPAdaper(val news: List<News>) : RecyclerView.Adapter<VPAdaper.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val newses = news[position]
        holder.title.text = newses.title
        holder.descrip.text = newses.text
        Glide.with(holder.itemView.context).load(newses.image).into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return news.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.title)
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val descrip: TextView = itemView.findViewById(R.id.descrip)
    }
}