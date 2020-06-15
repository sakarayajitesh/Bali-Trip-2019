package com.flashbox.balitrip2019.detail

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.flashbox.balitrip2019.detail.classes.*
import com.flashbox.balitrip2019.home.Home
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QuerySnapshot
import com.google.firebase.firestore.SetOptions
import kotlin.collections.ArrayList

class DetailViewModel(application: Application, private val home: Home) : AndroidViewModel(application) {

    private val _data = MutableLiveData<List<BaseItem>>()
    val data: LiveData<List<BaseItem>>
        get() = _data

    private val firestore = FirebaseFirestore.getInstance()

    init {
        getData()
    }


    private fun getData() {
        firestore.collection(home.name.toLowerCase())
            .orderBy("id")
            .addSnapshotListener{value, e ->
                if (e != null) {
                    Log.w("error", "Listen failed.", e)
                    return@addSnapshotListener
                }
                value?.let {
                    parseData(home.name.toLowerCase(), value)
                }
            }
    }

    private fun parseData(str: String, result: QuerySnapshot) {
        when (str) {
            "flights" -> parseFlights(result)
            "hotels" -> parseHotels(result)
            else -> parseActivity(result)
        }
    }

    private fun parse(result: QuerySnapshot) {
        for (document in result) {
            Log.e(document.id, document.data.toString())
        }
    }

    private fun addCompleted(document: String, value: Boolean) {
        val ref = firestore.collection(home.name.toLowerCase())
            .document(document)
        ref.update("completed", value)
            .addOnSuccessListener { Log.d("data", "DocumentSnapshot successfully written!") }
            .addOnFailureListener { e -> Log.w("data", "Error writing document", e) }
    }

    private fun parseActivity(result: QuerySnapshot) {
        val list = ArrayList<BaseItem>()
        for (document in result) {
            val data = document.data
            val completed = if (data.containsKey("completed")) {
                data["completed"] as Boolean
            } else {
                addCompleted(document.id, false)
                false
            }
            if (data.containsKey("layover"))
                list.add(Layover(document.id, data["id"].toString().toInt(), data["layover"].toString(), completed))
            else
                list.add(
                    Activity(
                        document.id,
                        data["id"].toString().toInt(),
                        data["image"].toString(),
                        data["name"].toString(),
                        data["d_d"].toString(),
                        data["start_at"].toString(),
                        data["start_time"].toString(),
                        data["end_time"].toString(),
                        data["timings"].toString(),
                        data["loc"].toString(),
                        data["entry_fee"].toString(),
                        data["dress_code"].toString(),
                        completed
                    )
                )
        }
        if (list.isNotEmpty()) {
            val temp = sortList(list)
            _data.value = temp
        }
    }

    private fun sortList(list: ArrayList<BaseItem>): List<BaseItem> {
        val temp = ArrayList(list)
        for (i in 0 until list.size) {
            val item = list[i]
            val completed = when (item) {
                is Activity -> item.completed
                is Layover -> item.completed
                is Flight -> item.completed
                is Hotel -> item.completed
                else -> false
            }
            if (completed) {
                temp.remove(item)
                temp.add(item)
            }
        }
        return temp
    }

    private fun parseHotels(result: QuerySnapshot) {
        val list = ArrayList<BaseItem>()
        for (document in result) {
            val data = document.data
            val completed = if (data.containsKey("completed")) {
                data["completed"] as Boolean
            } else {
                addCompleted(document.id, false)
                false
            }
            list.add(
                Hotel(
                    document.id,
                    data["id"].toString().toInt(),
                    data["image"].toString(),
                    data["confirmation_code"].toString(),
                    data["name"].toString(),
                    data["start_time"].toString(),
                    data["end_time"].toString(),
                    data["start_date"].toString(),
                    data["end_date"].toString(),
                    data["host"].toString(),
                    data["host_phone"].toString(),
                    data["loc"].toString(),
                    data["address"].toString(),
                    completed
                )
            )
        }
        if (list.isNotEmpty()) {
            val temp = sortList(list)
            _data.value = temp
        }
    }

    private fun parseFlights(result: QuerySnapshot) {
        val list = ArrayList<BaseItem>()
        for (document in result) {
            val data = document.data
            val completed = if (data.containsKey("completed")) {
                data["completed"] as Boolean
            } else {
                addCompleted(document.id, false)
                false
            }
            if (data.containsKey("layover")) {
                list.add(
                    Layover(
                        document.id,
                        data["id"].toString().toInt(),
                        data["layover"].toString(),
                        completed
                    )
                )
            } else {
                list.add(
                    Flight(
                        document.id,
                        data["id"].toString().toInt(),
                        data["booking_number"].toString(),
                        data["start"].toString(),
                        data["end"].toString(),
                        data["start_date"].toString(),
                        data["end_date"].toString(),
                        data["start_time"].toString(),
                        data["end_time"].toString(),
                        data["number"].toString(),
                        data["start_name"].toString(),
                        data["end_name"].toString(),
                        completed
                    )
                )
            }
        }
        if (list.isNotEmpty()) {
            val temp = sortList(list)
            _data.value = temp
        }
    }

    fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
        val position = viewHolder.adapterPosition
        val value = direction == ItemTouchHelper.LEFT
        val list = _data.value

        list?.let {
            val document = when(val item = it[position]){
                is Flight ->{
                    item.completed = value
                    item.document
                }
                is Activity ->{
                    item.completed = value
                    item.document

                }
                is Layover ->{
                    item.completed = value
                    item.document

                }
                is Hotel ->{
                    item.completed = value
                    item.document

                }
                else -> ""
            }
            addCompleted(document, value)
//            _data.value = sortList(list as ArrayList<BaseItem>)
        }
    }

}
