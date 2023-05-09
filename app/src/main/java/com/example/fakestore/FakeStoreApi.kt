package com.example.fakestore

import com.example.fakestore.model.Carts
import com.example.fakestore.model.Product
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface FakeStoreApi {

    @GET("/products")
    fun getAllProducts(): Single<List<Product>>

    @GET("/products/categories")
    fun getAllCategories(): Single<List<String>>

    @GET("/carts/user/{userId}")
    fun getCartsByUserId(@Path("userId") userId: Int): Single<List<Carts>>

    @GET("/users/{userId}")
    fun getUserById(@Path("userId") userId: Int):Single<Product>

    @GET("/products/{productId}")
    fun getProductById(@Path("productID") productID:Int):Single<Product>
}