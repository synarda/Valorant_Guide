package com.example.composetest.feature.guns.view_models

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.composetest.data.api.guns.GunModel
import com.example.composetest.data.api.guns.GunsModel
import com.example.composetest.data.repositories.RetrofitClientGuns
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GunsViewModel: ViewModel() {
    val gunsList = MutableLiveData<List<GunModel>>()
    var isLoading: Boolean by mutableStateOf(false)
    fun fetchGuns() {
        val call = RetrofitClientGuns.instance.getGuns()
        try {
            call.enqueue(object : Callback<GunsModel> {
                override  fun onResponse(call: Call<GunsModel>, response: Response<GunsModel>) {
                    if (response.isSuccessful) {
                        val guns = response.body()
                        if (guns != null) {
                            gunsList.value = guns.data
                            isLoading=true
                        }
                    }
                }
                override fun onFailure(call: Call<GunsModel>, t: Throwable) {
                    Log.e("Error", t.message.toString())
                }
            })
        } catch (e: Exception) {
            Log.e("Error", e.message.toString())
        }
    }

}