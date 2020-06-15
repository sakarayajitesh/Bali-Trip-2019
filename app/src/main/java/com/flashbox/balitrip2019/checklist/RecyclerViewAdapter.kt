package com.flashbox.balitrip2019.checklist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.flashbox.balitrip2019.databinding.ChecklistItemLayoutBinding

class RecyclerViewAdapter(private val list: List<CheckList>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ChecklistItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    class ViewHolder(private val binding: ChecklistItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(str: CheckList) {
            if(str.star && !str.name.contains("*"))
                str.name = str.name +"*"
            binding.check = str
        }
    }

}