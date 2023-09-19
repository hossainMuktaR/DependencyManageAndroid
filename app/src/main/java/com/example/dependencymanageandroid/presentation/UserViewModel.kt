package com.example.dependencymanageandroid.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.dependencymanageandroid.domain.UserListUseCase
import kotlinx.coroutines.launch

class UserViewModel(
    private val useCase: UserListUseCase
): ViewModel(){
    private val _state = mutableStateOf(UserListState())
    val state: State<UserListState> = _state

    init {
        viewModelScope.launch {
            useCase.invoke().also {
                _state.value = state.value.copy(
                    userList = it,
                    isLoading = false
                )
            }
        }
    }
}