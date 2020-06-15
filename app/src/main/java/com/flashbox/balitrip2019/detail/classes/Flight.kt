package com.flashbox.balitrip2019.detail.classes


data class Flight(
    val document: String,
    val id: Int,
    val bookingNumber: String,
    val start: String,
    val end: String,
    val startDate: String,
    val endDate: String,
    val startTime: String,
    val endTime: String,
    val number: String,
    val startName: String,
    val endName: String,
    var completed: Boolean
): BaseItem.Flight()