package com.example.yanolja.ui.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yanolja.databinding.ItemNewHotBinding

class NewHotAdapter : RecyclerView.Adapter<NewHotAdapter.NewHotViewHolder>() {

    private val _contentList = mutableListOf<String>()

    var contentList: List<String> = _contentList
        set(value) {
            _contentList.clear()
            _contentList.addAll(value)
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewHotViewHolder {
        val binding = ItemNewHotBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return NewHotViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NewHotViewHolder, position: Int) {
        holder.onBind(contentList[position])
    }

    override fun getItemCount(): Int = contentList.size

    inner class NewHotViewHolder(
        private val binding: ItemNewHotBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(title: String) {
            binding.tvItem.text = title
        }
    }
}