package com.psh.project.cocktailrecipes.data.model

import com.squareup.moshi.Json

data class Drink(
    @Json(name = "idDrink")
    val id: String,

    @Json(name = "strDrink")
    val name: String,

    @Json(name = "strInstructions")
    val instructions: String,

    @Json(name = "strDrinkThumb")
    val image: String,

    @Json(name = "strGlass")
    val glass: String,

    @Json(name = "strIngredient1")
    val ingredient1: String?,

    @Json(name = "strIngredient2")
    val ingredient2: String?,

    @Json(name = "strIngredient3")
    val ingredient3: String?,

    @Json(name = "strIngredient4")
    val ingredient4: String?,

    @Json(name = "strIngredient5")
    val ingredient5: String?,

    @Json(name = "strIngredient6")
    val ingredient6: String?,

    @Json(name = "strMeasure1")
    val measurement1: String?,

    @Json(name = "strMeasure2")
    val measurement2: String?,

    @Json(name = "strMeasure3")
    val measurement3: String?,

    @Json(name = "strMeasure4")
    val measurement4: String?,

    @Json(name = "strMeasure5")
    val measurement5: String?,

    @Json(name = "strMeasure6")
    val measurement6: String?,
) {
    fun getIngredientList(): List<Ingredient> {
        val ingredientList: MutableList<Ingredient> = mutableListOf()
        if (ingredient1 != null && measurement1 != null)
            ingredientList.add(Ingredient(ingredient1, measurement1))
        if (ingredient2 != null && measurement2 != null)
            ingredientList.add(Ingredient(ingredient2, measurement2))
        if (ingredient3 != null && measurement3 != null)
            ingredientList.add(Ingredient(ingredient3, measurement3))
        if (ingredient4 != null && measurement4 != null)
            ingredientList.add(Ingredient(ingredient4, measurement4))
        if (ingredient5 != null && measurement5 != null)
            ingredientList.add(Ingredient(ingredient5, measurement5))
        if (ingredient6 != null && measurement6 != null)
            ingredientList.add(Ingredient(ingredient6, measurement6))
        return ingredientList
    }
}

data class Ingredient(
    val item: String,
    val quantity: String
)
