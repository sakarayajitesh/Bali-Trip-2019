package com.flashbox.balitrip2019.home

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.flashbox.balitrip2019.R
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToDetailFragment(
    val home: Home
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_homeFragment_to_detailFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
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
  }

  companion object {
    fun actionHomeFragmentToDetailFragment(home: Home): NavDirections =
        ActionHomeFragmentToDetailFragment(home)
  }
}
