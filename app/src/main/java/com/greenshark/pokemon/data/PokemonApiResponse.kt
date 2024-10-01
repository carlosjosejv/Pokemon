package com.greenshark.pokemon.data

import com.google.gson.annotations.SerializedName

/**
 * Created by Carlos Jiménez on 30-Sep-24.
 */
data class PokemonApiResponse(
    val name: String,
    val order: Int,
    val sprites: Sprites,
    val types: ArrayList<Types>
)

data class Sprites(val other: Other)

data class Other(val home: Home)

data class Home(@SerializedName("front_default") val frontDefault: String)

data class Types(val slot: Int, val type: Type)

data class Type(val name: String)

data class AllPokemonApiResponse(
    val results: ArrayList<Pokemon>
)

data class Pokemon(val name: String)

