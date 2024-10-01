package com.greenshark.pokemon.ui.screens

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.greenshark.pokemon.ui.theme.PokemonTheme

/**
 * Created by Carlos Jiménez on 23-Sep-24.
 */


@Composable
fun HomeScreen() {
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {

    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    PokemonTheme {
        HomeScreen()
    }
}