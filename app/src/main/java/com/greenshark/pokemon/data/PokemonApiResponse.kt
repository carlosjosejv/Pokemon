package com.greenshark.pokemon.data

import com.google.gson.annotations.SerializedName

/**
 * Created by Carlos Jiménez on 30-Sep-24.
 */
data class PokemonApiResponse(
    val name: String = "",
    val order: Int = 0,
    val sprites: Sprites = Sprites(),
    val types: ArrayList<Types> = arrayListOf(),
    val stats: ArrayList<BaseStat> = arrayListOf(),
    val height: Int = 0,
    val weight: Int = 0
)

data class Sprites(val other: Other = Other())

data class Other(val home: Home = Home())

data class Home(@SerializedName("front_default") val frontDefault: String = "")

data class Types(val slot: Int = 0, val type: Type = Type())

data class Type(val name: String = "")

data class BaseStat(@SerializedName("base_stat") val baseStat: Int = 0, val stat: Stat = Stat())

data class Stat(val name: String = "")

data class AllPokemonApiResponse(
    val results: ArrayList<Pokemon> = arrayListOf()
)

data class Pokemon(val name: String = "")

