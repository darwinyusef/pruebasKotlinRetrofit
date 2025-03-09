package com.eject.withoutactivity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class ItemAdapter(context: Context, private val itemList: List<Item>) :
    ArrayAdapter<Item>(context, android.R.layout.simple_list_item_2, itemList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context)
            .inflate(android.R.layout.simple_list_item_2, parent, false)

        val item = itemList[position]
        view.findViewById<TextView>(android.R.id.text1).text = item.name
        view.findViewById<TextView>(android.R.id.text2).text = "Precio: ${item.price}"

        return view
    }
}
