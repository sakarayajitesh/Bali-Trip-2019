package com.flashbox.balitrip2019.dashboard

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.flashbox.balitrip2019.R
import com.flashbox.balitrip2019.databinding.DashItemLayoutBinding
import java.text.SimpleDateFormat
import java.util.*

class RecyclerViewAdapter(private val list: List<Dash>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = DashItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }


    class ViewHolder(private val binding: DashItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(dash: Dash) {
            binding.dash = dash
            val color = if(dash.spent) R.color.colorAccent else android.R.color.holo_green_dark
            binding.value.setTextColor(ContextCompat.getColor(binding.value.context, color))

            try{
                val sdf = SimpleDateFormat("dd-MM-yyyy 'at' HH:mm Z", Locale.getDefault())
                val netDate = Date()
                netDate.time = dash.getTimeStamp().toLong()
                binding.timeStamp.text = sdf.format(netDate)
            }catch (e: Exception){
                Log.e("error", e.toString())
            }
        }
    }

}