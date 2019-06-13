package com.example.firefly_driverapp.network
import com.example.firefly_driverapp.model.StatusModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Headers
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

interface NetworkService {
    @GET(Constant.BASE_URL + "common/versioncheck")
    fun versionCheck(): Call<StatusModel>
}