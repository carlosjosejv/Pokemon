package com.greenshark.pokemon.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.greenshark.pokemon.data.PokemonApiResponse
import com.greenshark.pokemon.network.PokemonApiRepository
import kotlinx.coroutines.launch

/**
 * Created by Carlos Jiménez on 01-Oct-24.
 */
class MainActivityViewModel : ViewModel() {

    private val pokemonApiRepository = PokemonApiRepository()

    private val _pokemonList = MutableLiveData<MutableList<PokemonApiResponse>>()
    val pokemonList: LiveData<MutableList<PokemonApiResponse>> = _pokemonList

    fun getAllPokemons() {
        viewModelScope.launch {
            val pokemons = pokemonApiRepository.getAllPokemons()?.results
            pokemons?.let {
                for (n in pokemons) {
                    getPokemon(n.name)
                }
            }
        }
    }

    fun getPokemon(name: String) {
        viewModelScope.launch {
            val pokemon = pokemonApiRepository.getPokemon(name)
            if(_pokemonList.value == null){
                _pokemonList.postValue(mutableListOf())
            }
            _pokemonList.value?.add(pokemon!!)
        }
    }
}