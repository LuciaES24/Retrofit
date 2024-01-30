package com.lespsan543.retrofit.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DogService {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://dog.ceo/api/breeds/image/random/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    suspend fun getDog() : DogModel{
        return retrofit.create(RetrofitAPI::class.java).getData(retrofit.baseUrl().toString())
    }
}