package com.example.firefly_driverapp.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class API {
    companion object {
        private var retrofit: Retrofit? = null

        val client: Retrofit
            get() {
                if (retrofit == null) {
                    retrofit = Retrofit.Builder()
                        .addConverterFactory(GsonConverterFactory.create())
                        .baseUrl(Constant.BASE_URL)
                        .build()
                }

                return retrofit!!
            }
    }
}