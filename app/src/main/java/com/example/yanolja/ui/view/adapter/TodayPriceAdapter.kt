package com.example.yanolja.ui.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yanolja.databinding.ItemNewHotBinding
import com.example.yanolja.databinding.ItemTodayPriceBinding
import com.example.yanolja.ui.view.TodayPriceItem

class TodayPriceAdapter : RecyclerView.Adapter<TodayPriceAdapter.TodayPriceViewHolder>() {

    private val _contentList = mutableListOf<TodayPriceItem>()

    var contentList: List<TodayPriceItem> = _contentList
        set(value) {
            _contentList.clear()
            _contentList.addAll(value)
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodayPriceViewHolder {
        val binding = ItemTodayPriceBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return TodayPriceViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TodayPriceViewHolder, position: Int) {
        holder.onBind(contentList[position])
    }

    override fun getItemCount(): Int = contentList.size

    inner class TodayPriceViewHolder(
        private val binding: ItemTodayPriceBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(item: TodayPriceItem) {
           binding.todayPrice = item
        }
    }
}