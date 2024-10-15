package com.greenshark.pokemon.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Carlos Jiménez on 02-Oct-24.
 */
object PokemonApiInstance {
    private const val BASE_URL = "https://pokeapi.co/api/v2/"

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val pokeonApi: PokemonApiService by lazy {
        retrofit.create(PokemonApiService::class.java)
    }
}