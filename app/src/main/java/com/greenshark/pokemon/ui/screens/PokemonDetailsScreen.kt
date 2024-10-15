package com.greenshark.pokemon.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import com.greenshark.pokemon.ui.theme.GrassType
import com.greenshark.pokemon.ui.theme.PoisonType
import com.greenshark.pokemon.ui.theme.PokemonTheme
import com.greenshark.pokemon.ui.theme.roboto

/**
 * Created by Carlos Jiménez on 15-Oct-24.
 */

@Composable
fun PokemonDetailsScreen() {
    LazyColumn {
        item {
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)) {


                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "#001", fontSize = 12.sp)
                    Text(text = "Bulbasur", color = Color.Blue, fontWeight = FontWeight.Bold)
                }


                Row(
                    modifier = Modifier
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
}

@Preview(showBackground = true)
@Composable
fun PokemonDetailsScreenPreview() {
    PokemonTheme {
        PokemonDetailsScreen()
    }
}
