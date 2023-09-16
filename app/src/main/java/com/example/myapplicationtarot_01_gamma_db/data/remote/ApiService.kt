package com.example.myapplicationtarot_01_gamma_db.data.remote

import com.example.myapplicationtarot_01_gamma_db.data.model.TarotDeckWithoutPic
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

val BASE_URL = "https://tarot-api-3hv5.onrender.com/api/v1/"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface ApiService {

    @GET("cards")
    suspend fun getCardsFromAPI() : TarotDeckWithoutPic
}

object CardsApi {
    val apiService: ApiService by lazy { retrofit.create(ApiService::class.java) }

}
