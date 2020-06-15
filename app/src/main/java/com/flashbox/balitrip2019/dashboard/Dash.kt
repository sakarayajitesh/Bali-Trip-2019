package com.flashbox.balitrip2019.dashboard

data class Dash(
    val value: String,
    val spent: Boolean,
    val where: String,
    val cash: Boolean?,
    private val timeStamp: Long = System.currentTimeMillis()
){
    var id: String? = null
    fun getTimeStamp() = timeStamp.toString()

    fun cashCard() = if(cash!=null && cash) "cash" else "card"
}