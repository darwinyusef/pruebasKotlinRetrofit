package com.eject.pruebainfo.view
import com.eject.pruebainfo.model.Item
import com.eject.pruebainfo.adapter.ItemAdapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)


        val items = listOf(
            Item("", "Producto 1", "10"),
            Item("", "Producto 2", "20"),
            Item("", "Producto 3", "30")
        )

        recyclerView.adapter = ItemAdapter(items)
    }
}
