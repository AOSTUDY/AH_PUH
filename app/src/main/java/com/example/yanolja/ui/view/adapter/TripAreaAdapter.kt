package com.example.yanolja.ui.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yanolja.databinding.ItemNewHotBinding
import com.example.yanolja.databinding.ItemTripAreaBinding
import com.example.yanolja.ui.view.TripAreaItem

class TripAreaAdapter : RecyclerView.Adapter<TripAreaAdapter.TripAreaViewHolder>() {

    private val _contentList = mutableListOf<TripAreaItem>()

    var contentList: List<TripAreaItem> = _contentList
        set(value) {
            _contentList.clear()
            _contentList.addAll(value)
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TripAreaViewHolder {
        val binding = ItemTripAreaBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return TripAreaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TripAreaViewHolder, position: Int) {
        holder.onBind(contentList[position])
    }

    override fun getItemCount(): Int = contentList.size

    inner class TripAreaViewHolder(
        private val binding: ItemTripAreaBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(item: TripAreaItem) {
            binding.tvArea.text = item.area
        }
    }
}