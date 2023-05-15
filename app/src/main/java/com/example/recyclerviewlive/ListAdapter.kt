package com.example.recyclerviewlive

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewlive.databinding.ItemListBinding

class ListAdapter(val list: List<ItemList>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root){
        fun onBind(item: ItemList){
            binding.recyclerText.setText(item.text)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemListBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }
}