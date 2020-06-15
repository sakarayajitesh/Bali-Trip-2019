package com.flashbox.balitrip2019.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.flashbox.balitrip2019.databinding.HomeItemLayoutBinding

class RecyclerViewAdapter(private val width:Int, private val list: List<Home>, private val onClickListener: OnClickListener) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    class OnClickListener(val clickListener: (position: Int) -> Unit){
        fun onClick(position: Int) = clickListener(position)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = HomeItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding, width)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
        holder.itemView.setOnClickListener {
            onClickListener.onClick(position)
        }
    }

    class ViewHolder(private val binding: HomeItemLayoutBinding, private val width:Int) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.layout.layoutParams.height = width
            binding.layout.layoutParams.width = width
        }
        fun bind(str: Home) {
            binding.home = str
            Glide.with(binding.image.context)
                .load(str.image)
                .centerCrop()
                .into(binding.image)
        }
    }

}