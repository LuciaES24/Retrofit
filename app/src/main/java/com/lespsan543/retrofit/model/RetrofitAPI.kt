package com.lespsan543.retrofit.model

import retrofit2.http.GET
import retrofit2.http.Url

interface RetrofitAPI {
    @GET
    suspend fun getData(@Url url : String) : DogModel
}