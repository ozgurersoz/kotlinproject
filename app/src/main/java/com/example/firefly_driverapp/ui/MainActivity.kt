package com.example.firefly_driverapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firefly_driverapp.R
import com.example.firefly_driverapp.model.StatusModel
import com.example.firefly_driverapp.network.API
import com.example.firefly_driverapp.network.NetworkService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    var service: NetworkService? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        service = API.client.create(NetworkService::class.java)
        var client = service?.versionCheck()

        client?.enqueue(object : Callback<StatusModel> {
            override fun onResponse(call: Call<StatusModel>, response: Response<StatusModel>) {
                println(response.body()?.status)
            }

            override fun onFailure(call: Call<StatusModel>, t: Throwable) {
                println(t.message)
            }
        })
    }
}
