package com.flashbox.balitrip2019.home

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "home_table")
data class Home(
    @PrimaryKey
    val id: Double,
    val name: String,
    val image: String,
    val extra: String?,
    var data: String?): Parcelable