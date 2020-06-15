package com.flashbox.balitrip2019.detail.classes

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
open class BaseItem : Parcelable{
    abstract class Flight: BaseItem()
    abstract class Layover: BaseItem()
    abstract class Hotel: BaseItem()
    abstract class Activity: BaseItem()
}