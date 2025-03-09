package com.eject.pruebainfo.viewmodel
import com.eject.pruebainfo.model.Item
import com.eject.pruebainfo.api.RetrofitClient

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ItemViewModel : ViewModel() {
    private val _items = MutableLiveData<List<Item>>()
    val items: LiveData<List<Item>> get() = _items

    fun fetchItems() {
        RetrofitClient.instance.getItems().enqueue(object : Callback<List<Item>> {
            override fun onResponse(call: Call<List<Item>>, response: Response<List<Item>>) {
                if (response.isSuccessful) {
                    _items.value = response.body()
                }
            }

            override fun onFailure(call: Call<List<Item>>, t: Throwable) {
                // Manejo de error
            }
        })
    }
}
