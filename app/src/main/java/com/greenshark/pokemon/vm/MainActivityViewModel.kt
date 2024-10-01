package com.greenshark.pokemon.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.greenshark.pokemon.network.PokemonApiRepository
import kotlinx.coroutines.launch

/**
 * Created by Carlos Jiménez on 01-Oct-24.
 */
class MainActivityViewModel: ViewModel() {

    private val pokemonApiRepository = PokemonApiRepository()

    fun getAllPokemons(){
        viewModelScope.launch {
            val pokemons = pokemonApiRepository.getAllPokemons()?.results

        }
    }

    fun getPokemon(name: String) {
        viewModelScope.launch {
            val pokemon = pokemonApiRepository.getPokemon(name)
        }
    }
}