package com.lespsan543.retrofit.model

import com.google.gson.annotations.SerializedName

data class DogModel(
    @SerializedName("message")
    var message:String,
    @SerializedName("status")
    var status : String
)
