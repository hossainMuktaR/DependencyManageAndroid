package com.example.dependencymanageandroid.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dependencymanageandroid.domain.UserListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
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