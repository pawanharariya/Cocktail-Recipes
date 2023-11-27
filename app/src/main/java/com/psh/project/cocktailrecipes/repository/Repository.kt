package com.psh.project.cocktailrecipes.repository

import com.psh.project.cocktailrecipes.data.model.Drink
import kotlinx.coroutines.flow.Flow

interface Repository {
    fun getRandomDrinks(): Flow<List<Drink>>
}