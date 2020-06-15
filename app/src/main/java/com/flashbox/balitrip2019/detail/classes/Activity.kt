package com.flashbox.balitrip2019.detail.classes

data class Activity(
    val document: String,
    val id: Int,
    val image: String,
    val name: String,
    val dD: String,
    val startAt: String,
    val startTime: String,
    val endTime: String,
    val timings: String,
    val loc: String,
    val entryFee: String,
    val dressCode: String,
    var completed: Boolean
): BaseItem.Activity()