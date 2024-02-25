package com.example.composetest.data.repositories

import com.example.composetest.data.api.agents.AgentsModel
import com.example.composetest.data.api.guns.ApiModelConstantGuns
import com.example.composetest.data.api.guns.ApiModelConstantGuns.END_POINTS_GUNS
import com.example.composetest.data.api.guns.GunsModel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

object RetrofitClientGuns {
    val instance: ValorantServiceGuns by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(ApiModelConstantGuns.BASE_URL_GUNS)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(ValorantServiceGuns::class.java)
    }
}
interface ValorantServiceGuns {
    @GET(END_POINTS_GUNS)
    fun getGuns(): Call<GunsModel>
}