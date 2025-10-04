package com.example.task4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Your data class (if not already created)
data class Phone(
    val imageResId: Int,
    val name: String
)

// Adapter class
class PhoneAdapter(private val phoneList: ArrayList<Phone>) :
    RecyclerView.Adapter<PhoneAdapter.PhoneViewHolder>() {

    // ViewHolder class
    class PhoneViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhoneViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.each_item, parent, false)
        return PhoneViewHolder(view)
    }

    override fun onBindViewHolder(holder: PhoneViewHolder, position: Int) {
        val currentItem = phoneList[position]
        holder.imageView.setImageResource(currentItem.imageResId)
        holder.textView.text = currentItem.name
    }

    override fun getItemCount(): Int {
        return phoneList.size
    }
}
