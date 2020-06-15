package com.flashbox.balitrip2019.detail


import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.flashbox.balitrip2019.home.Home


class DetailViewModelFactory(
    private val application: Application,
    private val home: Home
) : ViewModelProvider.Factory{

    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(DetailViewModel::class.java)){
            return DetailViewModel(application, home) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}