package com.greenshark.pokemon.network

import com.greenshark.pokemon.data.AllPokemonApiResponse
import com.greenshark.pokemon.data.PokemonApiResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Carlos Jiménez on 30-Sep-24.
 */
interface PokemonApiService {
    @GET("pokemon/{name}")
    fun getPokemon(@Path("name") name: String): Response<PokemonApiResponse>

    @GET("pokemon")
    fun getAllPokemon(): Response<AllPokemonApiResponse>
}