package com.greenshark.pokemon.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.greenshark.pokemon.ui.theme.GrassType
import com.greenshark.pokemon.ui.theme.PoisonType
import com.greenshark.pokemon.ui.theme.PokemonTheme
import com.greenshark.pokemon.ui.theme.roboto

/**
 * Created by Carlos Jiménez on 23-Sep-24.
 */

@Composable
fun PokemonCard() {
    ElevatedCard(elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)) {
        Box(
            modifier = Modifier
                .size(width = 250.dp, height = 300.dp)
                .padding(15.dp)
        ) {

            Text(
                text = "Name",
                modifier = Modifier.align(Alignment.TopStart),
                color = Color.Blue,
                fontFamily = roboto,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Indice",
                modifier = Modifier.align(Alignment.TopEnd),
                fontFamily = roboto,
                fontWeight = FontWeight.Bold
            )

            AsyncImage(
                modifier = Modifier.align(Alignment.Center),
                model = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/6.png",
                contentDescription = null,
            )

            Row(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Card(
                    modifier = Modifier.size(width = 100.dp, height = 30.dp),
                    colors = CardDefaults.cardColors(GrassType)
                ) {
                    Text(
                        text = "Grass",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 2.dp),
                        fontSize = 14.sp,
                        fontFamily = roboto,
                        fontWeight = FontWeight.Bold
                    )
                }

                Card(
                    modifier = Modifier.size(width = 100.dp, height = 30.dp),
                    colors = CardDefaults.cardColors(PoisonType)
                ) {
                    Text(
                        text = "Poison",
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 2.dp),
                        fontFamily = roboto,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PokemonCardPreview() {
    PokemonTheme {
        PokemonCard()
    }
}