package com.example.fakestore.data

import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class ApiService {
    private val BASE_URL = "https://fakestoreapi.com"
    private val retrofit= Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .build()

    val fakeStoreApiService = retrofit.create(FakeStoreApi::class.java)

}