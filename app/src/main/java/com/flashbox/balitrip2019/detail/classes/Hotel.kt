package com.flashbox.balitrip2019.detail.classes

data class Hotel(
    val document: String,
    val id: Int,
    val image: String,
    val confirmationCode: String,
    val name: String,
    val start_time: String,
    val end_time: String,
    val start_date: String,
    val end_date: String,
    val host: String,
    val hostNumber: String,
    val location: String,
    val address: String,
    var completed: Boolean
    ): BaseItem.Hotel()