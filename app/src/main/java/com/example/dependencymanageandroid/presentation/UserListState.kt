package com.example.dependencymanageandroid.presentation

import com.example.dependencymanageandroid.data.User

data class UserListState(
    val userList: List<User> = emptyList(),
    val isLoading: Boolean = true,
)
