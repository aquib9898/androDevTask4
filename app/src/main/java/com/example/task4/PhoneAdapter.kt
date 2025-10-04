package com.example.task4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PhoneAdapter(private val phoneList: List<Phone>) :
    RecyclerView.Adapter<PhoneAdapter.PhoneViewHolder>() {

    class PhoneViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhoneViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item, parent, false)
        return PhoneViewHolder(view)
    }

    override fun onBindViewHolder(holder: PhoneViewHolder, position: Int) {
        val item = phoneList[position]
        holder.imageView.setImageResource(item.image)
        holder.textView.text = item.name
    }

    override fun getItemCount(): Int = phoneList.size
}
