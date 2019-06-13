package com.example.firefly_driverapp.model

import com.google.gson.annotations.SerializedName

data class StatusModel (
    @field:SerializedName("status")
    val status: Boolean
)