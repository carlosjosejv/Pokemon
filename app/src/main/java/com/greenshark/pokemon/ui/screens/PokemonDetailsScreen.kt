package com.greenshark.pokemon.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.greenshark.pokemon.R
import com.greenshark.pokemon.ui.components.BreedingCard
import com.greenshark.pokemon.ui.theme.ElectricType
import com.greenshark.pokemon.ui.theme.FightingType
import com.greenshark.pokemon.ui.theme.FireType
import com.greenshark.pokemon.ui.theme.GrassType
import com.greenshark.pokemon.ui.theme.LightGreen
import com.greenshark.pokemon.ui.theme.PoisonType
import com.greenshark.pokemon.ui.theme.PokemonTheme
import com.greenshark.pokemon.ui.theme.roboto

/**
 * Created by Carlos Jiménez on 15-Oct-24.
 */

@Composable
fun PokemonDetailsScreen() {
    LazyColumn(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        item {
            ElevatedCard(
                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                modifier = Modifier
                    .fillMaxWidth()
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Column {
                        Text(text = "#001", fontSize = 12.sp)
                        Text(
                            text = "Bulbasaur",
                            color = Color.Blue,
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp
                        )
                    }

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Card(
                            modifier = Modifier.size(width = 80.dp, height = 25.dp),
                            colors = CardDefaults.cardColors(GrassType)
                        ) {
                            Text(
                                text = "Grass",
                                color = Color.White,
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                                    .fillMaxSize(),
                                fontSize = 12.sp,
                                fontFamily = roboto,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        Card(
                            modifier = Modifier.size(width = 80.dp, height = 25.dp),
                            colors = CardDefaults.cardColors(PoisonType)
                        ) {
                            Text(
                                text = "Poison",
                                color = Color.White,
                                textAlign = TextAlign.Center,
                                fontSize = 12.sp,
                                modifier = Modifier
                                    .fillMaxSize(),
                                fontFamily = roboto,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }

                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 40.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Column(
                        modifier = Modifier
                            .padding(start = 20.dp)
                            .width(180.dp)
                    ) {

                        Text(text = "HP", fontSize = 12.sp, fontFamily = roboto)

                        LinearProgressIndicator(progress = {
                            0.2f
                        }, color = GrassType, trackColor = LightGreen)

                        Text(text = "Attack", fontSize = 12.sp, fontFamily = roboto)

                        LinearProgressIndicator(progress = {
                            0.8f
                        }, color = FireType, trackColor = Color.LightGray)

                        Text(text = "Defense", fontSize = 12.sp, fontFamily = roboto)

                        LinearProgressIndicator(progress = {
                            0.9f
                        }, color = ElectricType, trackColor = Color.LightGray)

                        Text(text = "Speed", fontSize = 12.sp, fontFamily = roboto)

                        LinearProgressIndicator(progress = {
                            0.6f
                        }, color = FightingType, trackColor = Color.LightGray)


                    }

                    Image(
                        painter = painterResource(R.drawable.bulbasur),
                        contentDescription = "Pokemon",
                    )
                }


            }
        }

        item {
            ElevatedCard(
                elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(20.dp)) {
                    Text(text = "Breeding", fontSize = 20.sp, fontWeight = FontWeight.Bold)

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 20.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        BreedingCard("Height", "2.04''", "0.7 m")

                        BreedingCard("Weight", "1.5 lbs", "6.9 kg")
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
