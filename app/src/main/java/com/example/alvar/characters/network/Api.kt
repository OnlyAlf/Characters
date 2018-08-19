package com.example.alvar.characters.network

import com.example.alvar.characters.utils.Constants.BASE_URL
import com.example.alvar.characters.models.Items
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("/")
    fun getJson(@Query("q") q: String ,@Query("format") format: String): Call<Items>

    companion object {

        fun create(): Api {
            val retrofit = Retrofit.Builder()
                    .addConverterFactory(
                            GsonConverterFactory.create())
                    .baseUrl(BASE_URL)
                    .build()

            return retrofit.create(Api::class.java)
        }
    }
}