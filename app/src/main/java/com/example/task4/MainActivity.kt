package com.example.task4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val desiredItemWidthDp = 160

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataToList()
    }

    private fun initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView)

        val displayMetrics = resources.displayMetrics
        val screenWidthDp = displayMetrics.widthPixels / displayMetrics.density
        val spanCount = (screenWidthDp / desiredItemWidthDp).toInt().coerceAtLeast(1)

        // correct property name: layoutManager (lowercase)
        recyclerView.layoutManager = GridLayoutManager(this, spanCount)
        recyclerView.setHasFixedSize(true)
    }

    private fun addDataToList() {
        // Using built-in Android icons to avoid missing-drawable compile errors.
        val list = arrayListOf(
            Phone(android.R.drawable.ic_menu_camera, "iPhone 17 (placeholder)"),
            Phone(android.R.drawable.ic_menu_gallery, "iPhone Air 17 (placeholder)"),
            Phone(android.R.drawable.ic_menu_compass, "Samsung S25 (placeholder)"),
            Phone(android.R.drawable.ic_menu_crop, "Vivo T4 (placeholder)"),
            Phone(android.R.drawable.ic_menu_call, "Z Fold 7 (placeholder)"),
            Phone(android.R.drawable.ic_menu_search, "iQOO 10R (placeholder)"),
            Phone(android.R.drawable.ic_menu_manage, "Samsung F62 (placeholder)")
        )

        val adapter = PhoneAdapter(list)
        recyclerView.adapter = adapter
    }
}

