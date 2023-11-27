package com.psh.project.cocktailrecipes.di

import com.psh.project.cocktailrecipes.data.remote.Constants
import com.psh.project.cocktailrecipes.data.remote.DrinksApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    // Drinks API
    @Singleton
    @Provides
    fun provideDrinksAPI(): DrinksApi {
        val retrofit = Retrofit
            .Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        return retrofit.create(DrinksApi::class.java)
    }

}