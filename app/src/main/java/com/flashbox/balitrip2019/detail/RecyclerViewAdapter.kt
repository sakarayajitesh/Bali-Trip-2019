package com.flashbox.balitrip2019.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.flashbox.balitrip2019.databinding.FlightItemLayoutBinding
import com.flashbox.balitrip2019.databinding.HotelItemLayoutBinding
import com.flashbox.balitrip2019.databinding.LayoverItemLayoutBinding
import android.content.Intent
import android.net.Uri
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.flashbox.balitrip2019.R
import com.flashbox.balitrip2019.databinding.ActivityItemLayoutBinding
import com.flashbox.balitrip2019.detail.classes.*


class RecyclerViewAdapter(private val list: List<BaseItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val Flight = 0
        const val Layover = 1
        const val Hotel = 2
        const val Activity = 3
    }

    override fun getItemViewType(position: Int) = when (list[position]) {
        is Flight -> Flight
        is Layover -> Layover
        is Hotel -> Hotel
        is Activity -> Activity
        else -> Flight
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        when (viewType) {
            Flight -> FlightViewHolder(
                FlightItemLayoutBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            Layover -> LayoverViewHolder(
                LayoverItemLayoutBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            Hotel -> HotelViewHolder(
                HotelItemLayoutBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            Activity -> ActivityViewHolder(
                ActivityItemLayoutBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            else -> FlightViewHolder(
                FlightItemLayoutBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }


    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = list[position]
        when (holder) {
            is FlightViewHolder -> if (item is Flight) holder.bind(item)
            is LayoverViewHolder -> if (item is Layover) holder.bind(item)
            is HotelViewHolder -> if (item is Hotel) {
                holder.bind(item)
                holder.itemView.setOnLongClickListener {
                    if (item.location.isNotEmpty()) {
                        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(item.location))
                        it.context.startActivity(browserIntent)
                    }else{
                        Toast.makeText(it.context, "Location is not available", Toast.LENGTH_SHORT).show()
                    }
                    true

                }
            }
            is ActivityViewHolder -> if (item is Activity) {
                holder.bind(item)
                holder.itemView.setOnLongClickListener {
                    if (item.loc.isNotEmpty()) {
                        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(item.loc))
                        it.context.startActivity(browserIntent)
                    }else{
                        Toast.makeText(it.context, "Location is not available", Toast.LENGTH_SHORT).show()
                    }
                    true
                }
            }
        }
    }

    class FlightViewHolder(private val binding: FlightItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(flight: Flight) {
            binding.flight = flight
            val color = if (flight.completed) R.color.colorExtra else android.R.color.white
            binding.cardview.setCardBackgroundColor(ContextCompat.getColor(binding.cardview.context, color))
            binding.completed.visibility = if (flight.completed) View.VISIBLE else View.GONE

        }
    }

    class LayoverViewHolder(private val binding: LayoverItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(flight: Layover) {
            binding.layover = flight
            val color = if (flight.completed) android.R.color.darker_gray else android.R.color.transparent
            binding.view.background = ContextCompat.getDrawable(binding.view.context, color)
            binding.completed.visibility = if (flight.completed) View.VISIBLE else View.GONE
        }
    }

    class HotelViewHolder(private val binding: HotelItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(flight: Hotel) {
            binding.hotel = flight
            Glide.with(binding.image.context)
                .load(flight.image)
                .centerCrop()
                .into(binding.image)
            val color = if (flight.completed) R.color.colorExtra else android.R.color.white
            binding.cardview.setCardBackgroundColor(ContextCompat.getColor(binding.cardview.context, color))
            binding.completed.visibility = if (flight.completed) View.VISIBLE else View.GONE
            binding.call.setOnClickListener {
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:${flight.hostNumber}")
                it.context.startActivity(intent)
            }

        }
    }

    class ActivityViewHolder(private val binding: ActivityItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(flight: Activity) {
            binding.activity = flight
            Glide.with(binding.image.context)
                .load(flight.image)
                .centerCrop()
                .into(binding.image)
            val color = if (flight.completed) R.color.colorExtra else android.R.color.white
            binding.cardview.setCardBackgroundColor(ContextCompat.getColor(binding.cardview.context, color))
            binding.completed.visibility = if (flight.completed) View.VISIBLE else View.GONE
        }
    }

}