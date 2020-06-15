package com.flashbox.balitrip2019.detail

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.flashbox.balitrip2019.home.Home
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class DetailFragmentArgs(
  val home: Home
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(Home::class.java)) {
      result.putParcelable("home", this.home as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(Home::class.java)) {
      result.putSerializable("home", this.home as Serializable)
    } else {
      throw UnsupportedOperationException(Home::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): DetailFragmentArgs {
      bundle.setClassLoader(DetailFragmentArgs::class.java.classLoader)
      val __home : Home?
      if (bundle.containsKey("home")) {
        if (Parcelable::class.java.isAssignableFrom(Home::class.java) ||
            Serializable::class.java.isAssignableFrom(Home::class.java)) {
          __home = bundle.get("home") as Home?
        } else {
          throw UnsupportedOperationException(Home::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__home == null) {
          throw IllegalArgumentException("Argument \"home\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"home\" is missing and does not have an android:defaultValue")
      }
      return DetailFragmentArgs(__home)
    }
  }
}
