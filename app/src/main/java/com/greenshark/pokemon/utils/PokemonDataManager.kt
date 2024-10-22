package com.greenshark.pokemon.utils

import androidx.compose.ui.graphics.Color
import com.greenshark.pokemon.ui.theme.BugType
import com.greenshark.pokemon.ui.theme.DarkType
import com.greenshark.pokemon.ui.theme.DragonType
import com.greenshark.pokemon.ui.theme.ElectricType
import com.greenshark.pokemon.ui.theme.FairyType
import com.greenshark.pokemon.ui.theme.FightingType
import com.greenshark.pokemon.ui.theme.FireType
import com.greenshark.pokemon.ui.theme.FlyingType
import com.greenshark.pokemon.ui.theme.GhostType
import com.greenshark.pokemon.ui.theme.GrassType
import com.greenshark.pokemon.ui.theme.GroundType
import com.greenshark.pokemon.ui.theme.IceType
import com.greenshark.pokemon.ui.theme.NormalType
import com.greenshark.pokemon.ui.theme.PoisonType
import com.greenshark.pokemon.ui.theme.PsychicType
import com.greenshark.pokemon.ui.theme.RockType
import com.greenshark.pokemon.ui.theme.SteelType
import com.greenshark.pokemon.ui.theme.WaterType

/**
 * Created by Carlos Jiménez on 22-Oct-24.
 */
class PokemonDataManager {

    fun getTypeColor(type: String): Color {
        return when (type) {
            "grass" -> GrassType
            "poison" -> PoisonType
            "bug" -> BugType
            "dragon" -> DragonType
            "steel" -> SteelType
            "dark" -> DarkType
            "flying" -> FlyingType
            "normal" -> NormalType
            "ghost" -> GhostType
            "rock" ->  RockType
            "ground" -> GroundType
            "fighting" -> FightingType
            "fire" -> FireType
            "electric" -> ElectricType
            "psychic" -> PsychicType
            "fairy" -> FairyType
            "water" -> WaterType
            "ice" -> IceType
            else -> DarkType
        }
    }

}