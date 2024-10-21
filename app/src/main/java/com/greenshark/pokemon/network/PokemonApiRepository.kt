package com.greenshark.pokemon.network

import com.greenshark.pokemon.data.AllPokemonApiResponse
import com.greenshark.pokemon.data.PokemonApiResponse

/**
 * Created by Carlos Jiménez on 01-Oct-24.
 */

class PokemonApiRepository {
    private val api = PokemonApiInstance.pokemonApi

    suspend fun getAllPokemons(): AllPokemonApiResponse? {
        val response = api.getAllPokemon()
        if (response.isSuccessful) {
            return response.body()
        }
        return null
    }

    suspend fun getPokemon(name: String): PokemonApiResponse? {
        val response = api.getPokemon(name)
        if (response.isSuccessful) {
            return response.body()
        }
        return null
    }
}