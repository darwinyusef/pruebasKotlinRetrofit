package com.eject.pruebainfo.api
import com.eject.pruebainfo.model.Item

import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("items")
    fun getItems(): Call<List<Item>>

    @POST("items")
    fun createItem(@Body item: Item): Call<Item>

    @PUT("items/{uuid}")
    fun updateItem(@Path("uuid") uuid: String, @Body item: Item): Call<Item>

    @DELETE("items/{uuid}")
    fun deleteItem(@Path("uuid") uuid: String): Call<Unit>
}
