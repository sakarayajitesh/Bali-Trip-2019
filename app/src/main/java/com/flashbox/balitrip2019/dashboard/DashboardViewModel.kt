package com.flashbox.balitrip2019.dashboard

import android.app.Application
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query

class DashboardViewModel(application: Application) : AndroidViewModel(application) {

    private val firebaseFirestore = FirebaseFirestore.getInstance()
    private var addDashListener = false

    private val _dashboard = MutableLiveData<Dashboard>()
    val dashboard: LiveData<Dashboard>
        get() = _dashboard

    private val _dash = MutableLiveData<List<Dash>>()
    val dash: LiveData<List<Dash>>
        get() = _dash

    init {
        getData()
    }

    private fun getData() {
        firebaseFirestore.collection("dashboard").addSnapshotListener { value, e ->
            if (e != null) {
                Log.w("error", "Listen failed.", e)
                return@addSnapshotListener
            }
            for (document in value!!) {
                val dash = Dashboard(
                    document.id,
                    document["total"].toString(),
                    document["spent"].toString(),
                    document["remaining"].toString()
                )
                Log.e("error", document.data.toString())
                _dashboard.value = dash
                if (!addDashListener) {
                    addDashListener()
                    addDashListener = true
                }
                break
            }
        }
    }

    private fun addDashListener() {
        _dashboard.value?.id?.let {
            firebaseFirestore.collection("dashboard").document(it).collection("dash")
                .orderBy("timeStamp", Query.Direction.DESCENDING).addSnapshotListener { value, e ->
                    if (e != null) {
                        Log.w("error", "Listen failed.", e)
                        return@addSnapshotListener
                    }
                    val list = ArrayList<Dash>()
                    for (document in value!!) {
                        val timeStamp = document["timeStamp"].toString().toLong()
                        val dash = Dash(
                            document["value"].toString(),
                            document["spent"] as Boolean,
                            document["where"].toString(),
                            document["cash"] as Boolean,
                            timeStamp
                        )
                        dash.id = document.id
                        list.add(dash)
                    }
                    _dash.value = list
                }

        }
    }

    private fun addDashboard(value: String, spent: Boolean) {
        _dashboard.value?.let {
            if (spent)
                firebaseFirestore.collection("dashboard").document(it.id).update(
                    mapOf(
                        "spent" to (it.spent.toLong() + value.toLong()).toString(),
                        "remaining" to (it.remaining.toLong() - value.toLong()).toString(),
                        "total" to it.total
                    )
                )
            else
                firebaseFirestore.collection("dashboard").document(it.id).update(
                    mapOf(
                        "spent" to it.spent,
                        "remaining" to (it.remaining.toLong() + value.toLong()).toString(),
                        "total" to (it.total.toLong() + value.toLong()).toString()
                    )
                )

        }

    }

    fun addDash(context: Context, purpose: String, value: String, addSpent: String, cashCard: String) {
        if(purpose.isNotEmpty() && value.isNotEmpty()) {
            val addSpentValue = addSpent == "Spent"
            val valueEnd = if (addSpentValue)
                "-$value"
            else
                "+$value"
            addDashboard(value, addSpentValue)
            val dash = Dash(valueEnd, addSpentValue, purpose, cashCard == "Cash")
            _dashboard.value?.id?.let {
                firebaseFirestore.collection("dashboard").document(it).collection("dash").document().set(dash)
            }
        }else{
            Toast.makeText(context, "Nothing Added", Toast.LENGTH_SHORT).show()
        }
    }

    fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
        val position = viewHolder.adapterPosition
        _dash.value?.let {
            val dash = it[position]
            val id = _dashboard.value?.id
            id?.let { iD ->
                dash.id?.let { dashId ->
                    firebaseFirestore.collection("dashboard").document(iD).collection("dash").document(dashId).delete()
                    doAfterDelete(dash)
                }
            }
        }
    }

    private fun changeDashboard(spent: String, remaining: String, total: String){
        _dashboard.value?.let {
            firebaseFirestore.collection("dashboard").document(it.id).update(
                mapOf(
                    "spent" to spent,
                    "remaining" to remaining,
                    "total" to total
                )
            )
        }
    }

    private fun doAfterDelete(dash: Dash) {
        _dashboard.value?.let {
            if (dash.spent) {
                val total = it.total
                val remaining = it.remaining.toLong() - dash.value.toLong()
                val spent = it.spent.toLong() + dash.value.toLong()
                changeDashboard(spent.toString(), remaining.toString(), total)
            } else {
                val total = it.total.toLong() - dash.value.toLong()
                val remaining = it.remaining.toLong() - dash.value.toLong()
                val spent = it.spent
                changeDashboard(spent, remaining.toString(), total.toString())
            }
        }
    }

    fun clearList(){
        _dashboard.value?.let {
            changeDashboard("0", "0", "0")
            firebaseFirestore.collection("dashboard").document(it.id).collection("dash").get().addOnSuccessListener{documents ->
                for (document in documents) {
                    Log.e("deleted", document.data.toString())
                    firebaseFirestore.collection("dashboard").document(it.id).collection("dash").document(document.id).delete()
                }
            }
        }
    }
}
