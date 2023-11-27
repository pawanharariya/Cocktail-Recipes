package com.psh.project.cocktailrecipes.ui.home

import com.psh.project.cocktailrecipes.data.model.Drink

data class HomeState(
    val isLoading: Boolean = false,
    val errorMsg: String? = null,
    val drinks: List<Drink> = emptyList(),
    val currentDrink: Drink? = null
)