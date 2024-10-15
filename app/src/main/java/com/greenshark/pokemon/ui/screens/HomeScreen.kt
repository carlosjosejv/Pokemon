package com.greenshark.pokemon.ui.screens

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.greenshark.pokemon.ui.components.PokemonCard
import com.greenshark.pokemon.ui.theme.PokemonTheme
import com.greenshark.pokemon.vm.MainActivityViewModel

/**
 * Created by Carlos Jiménez on 23-Sep-24.
 */

@Composable
fun HomeScreen(
    viewModel: MainActivityViewModel = MainActivityViewModel(),
    modifier: Modifier = Modifier
) {
    val pokemons by viewModel.pokemonList.observeAsState(emptyList())

    LaunchedEffect(pokemons) {
        if (pokemons.isEmpty()) {
            viewModel.getAllPokemons()
        }
    }

    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(pokemons) {
            PokemonCard(
                it.name,
                it.order,
                it.types,
                it.sprites.other.home.frontDefault
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    PokemonTheme {
        HomeScreen()
    }
}