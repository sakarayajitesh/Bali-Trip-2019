package com.flashbox.balitrip2019.checklist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel;
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import com.google.firebase.firestore.QuerySnapshot

class ChecklistViewModel : ViewModel() {

    private val _data = MutableLiveData<ArrayList<CheckList>>()
    val data: LiveData<ArrayList<CheckList>>
        get() = _data

    init {
        getData()
    }

    private fun getData() {
        val db = FirebaseFirestore.getInstance()
        db.collection("checklist")
            .orderBy("star", Query.Direction.DESCENDING)
            .get()
            .addOnCompleteListener {
                if (it.isSuccessful) {
                    parseData(it.result)
                }
            }
    }

    private fun parseData(result: QuerySnapshot?) {
        result?.let {
            val list = ArrayList<CheckList>()
            for (document in result) {
                list.add(CheckList(document["name"].toString(), false, document.get("star") as Boolean))
            }
            _data.value = list
        }
    }
}
