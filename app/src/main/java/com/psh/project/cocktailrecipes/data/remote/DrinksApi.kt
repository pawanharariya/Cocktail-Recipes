package com.psh.project.cocktailrecipes.data.remote

import com.psh.project.cocktailrecipes.data.model.Drink
import retrofit2.http.GET
import retrofit2.http.Path

interface DrinksApi {

    @GET("search.php?s={keyword}")
    suspend fun getSearchResults(@Path("keyword") keyword: String): List<Drink>
}