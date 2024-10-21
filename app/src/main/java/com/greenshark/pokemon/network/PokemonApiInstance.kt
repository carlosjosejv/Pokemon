package com.greenshark.pokemon.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Carlos Jiménez on 02-Oct-24.
 */
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

object PokemonApiInstance {
    private const val BASE_URL = "https://pokeapi.co/api/v2/"

    private val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)  // Add the logging interceptor
        .build()

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)  // Use OkHttp client with logging
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val pokemonApi: PokemonApiService by lazy {
        retrofit.create(PokemonApiService::class.java)
    }
}
