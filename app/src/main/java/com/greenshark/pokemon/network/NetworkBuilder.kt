package com.greenshark.pokemon.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Carlos Jiménez on 01-Oct-24.
 */
object NetworkBuilder {
    private const val BASE_URL = "https://pokeapi.co/api/v2/"

    val api: PokemonApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(PokemonApiService::class.java)
    }
}