package com.example.blankproject.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.blankproject.databinding.ItemAdapterBinding
import com.example.blankproject.model.ModelExample

class SimpleAdapter(private val onClick: (Int) -> Unit = {}) : RecyclerView.Adapter<SimpleAdapter.SimpleViewHolder>() {

    var models: List<ModelExample> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleViewHolder {
        return SimpleViewHolder(ItemAdapterBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
        holder.binding.apply {
            textTitle.text = models[position].title
            textDescription.text = models[position].description
        }
    }

    override fun getItemCount() = models.size

    inner class SimpleViewHolder(val binding: ItemAdapterBinding) : RecyclerView.ViewHolder(binding.root), View.OnClickListener {

        init {
            binding.root.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                onClick.invoke(position)
            }
        }
    }
}