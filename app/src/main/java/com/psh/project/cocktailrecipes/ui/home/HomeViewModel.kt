package com.psh.project.cocktailrecipes.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.psh.project.cocktailrecipes.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val repository: Repository) : ViewModel() {
    private val _state = MutableStateFlow(HomeState())
    val state = _state.asStateFlow()

    init {
        getRandomDrinks()
    }

    private fun getRandomDrinks() {
        viewModelScope.launch {
            repository.getRandomDrinks().collectLatest { drinks ->
                _state.update { currentState ->
                    currentState.copy(
                        isLoading = false, drinks = drinks
                    )
                }
            }
        }
    }
}