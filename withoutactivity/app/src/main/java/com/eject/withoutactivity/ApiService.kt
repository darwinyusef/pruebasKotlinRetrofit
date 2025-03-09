package com.eject.withoutactivity

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("ebf08e0ba8bd443220ec6fca80217742/raw/5094134f24824e9748093a9f98b27fbe3e65a311/items.json")
    fun getItems(): Call<List<Item>>
}
