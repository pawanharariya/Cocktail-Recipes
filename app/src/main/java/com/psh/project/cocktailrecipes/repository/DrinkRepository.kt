package com.psh.project.cocktailrecipes.repository

import com.psh.project.cocktailrecipes.data.remote.DrinksApi
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class DrinkRepository @Inject constructor(private val drinksApi: DrinksApi) : Repository {
    override fun getRandomDrinks() = flow {
        emit(drinksApi.getSearchResults("Margarita"))
    }
}