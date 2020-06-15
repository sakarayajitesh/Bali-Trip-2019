package com.flashbox.balitrip2019.home

import android.app.Application
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.flashbox.balitrip2019.database.getAppDatabase
import com.flashbox.balitrip2019.detail.classes.Activity
import com.flashbox.balitrip2019.detail.classes.Flight
import com.flashbox.balitrip2019.detail.classes.Hotel
import com.flashbox.balitrip2019.detail.classes.Layover
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QuerySnapshot
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

class HomeViewModel(application: Application) : AndroidViewModel(application) {

    private val _items = MutableLiveData<List<Home>>()
    val items: LiveData<List<Home>>
        get() = _items

    private val _openItem = MutableLiveData<Home>()
    val openItem: LiveData<Home>
        get() = _openItem

    private val firestore = FirebaseFirestore.getInstance()



    init {
        addItems()
    }


    private fun addItems() {
        firestore.collection("home")
            .get()
            .addOnCompleteListener {
                if (it.isSuccessful) {
                    it.result?.let { result ->
                        val list = ArrayList<Home>()
                        for (document in result) {
                            val data = document.data
                            val extra =
                                if (!data.containsKey("extra")) "" else "\n${data["extra"].toString()}"
                            val home = Home(
                                document.id.toDouble(),
                                data["name"].toString(),
                                data["image"].toString(),
                                extra,
                                null
                            )
                            list.add(home)
                        }
                        _items.value = list
                    }
                }
            }
    }


    fun onClicked(position: Int) {
        _openItem.value = _items.value?.get(position)
    }

    fun onClickedCompleted() {
        _openItem.value = null
    }

    override fun onCleared() {
        super.onCleared()
    }
}