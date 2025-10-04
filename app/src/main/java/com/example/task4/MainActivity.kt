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

        recyclerView.layoutManager = GridLayoutManager(this, spanCount)
        recyclerView.setHasFixedSize(true)
    }

    private fun addDataToList() {
        val list = arrayListOf(
            Phone(R.drawable.iph17, "iPhone 17 (placeholder)"),
            Phone(R.drawable.iphair17, "iPhone Air 17 (placeholder)"),
            Phone(R.drawable.samsungs25, "Samsung S25 (placeholder)"),
            Phone(R.drawable.vivot4, "Vivo T4 (placeholder)"),
            Phone(R.drawable.iph17, "iPhone 17 (placeholder)"),
            Phone(R.drawable.zfold7, "Z Fold 7 (placeholder)"),
            Phone(R.drawable.iqoo10r, "iQOO 10R (placeholder)"),
            Phone(R.drawable.sf62, "Samsung F62 (placeholder)"),
            Phone(R.drawable.vivot4, "Vivo T4 (placeholder)"),
            Phone(R.drawable.samsungs25, "Samsung S25 (placeholder)"),
            Phone(R.drawable.iph17, "iPhone 17 (placeholder)"),
            Phone(R.drawable.iphair17, "iPhone Air 17 (placeholder)")

        )

        val adapter = PhoneAdapter(list)
        recyclerView.adapter = adapter
    }
}

