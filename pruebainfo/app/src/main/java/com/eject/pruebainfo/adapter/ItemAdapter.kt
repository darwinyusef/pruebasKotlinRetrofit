package com.eject.pruebainfo.adapter
import com.eject.pruebainfo.model.Item


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eject.pruebainfo.databinding.ItemRowBinding

class ItemAdapter(private val items: List<Item>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(val binding: ItemRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ItemRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]
        holder.binding.textViewName.text = item.name
        holder.binding.textViewPrice.text = item.price
    }

    override fun getItemCount() = items.size
}
