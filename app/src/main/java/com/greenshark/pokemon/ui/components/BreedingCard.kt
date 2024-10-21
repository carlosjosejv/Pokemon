package com.greenshark.pokemon.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.greenshark.pokemon.ui.theme.PokemonTheme

/**
 * Created by Carlos Jiménez on 21-Oct-24.
 */

@Composable
fun BreedingCard(type: String, value1: String, value2: String){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = type, fontSize = 12.sp)

        Card(
            border = BorderStroke(2.dp, Color.LightGray),
            modifier = Modifier
                .width(160.dp)
                .height(40.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.spacedBy(
                    space = 20.dp,
                    alignment = Alignment.CenterHorizontally
                ),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = value1, fontSize = 12.sp)
                Text(text = value2, fontSize = 12.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BreedingCardPreview(){
    PokemonTheme {
        BreedingCard("Height", "2.0''", "0.5 m")
    }
}