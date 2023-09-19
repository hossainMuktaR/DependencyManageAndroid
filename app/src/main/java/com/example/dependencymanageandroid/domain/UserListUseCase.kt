package com.example.dependencymanageandroid.domain

import com.example.dependencymanageandroid.data.User
import kotlinx.coroutines.delay

class UserListUseCase(
    private val repository: UserRepository
) {
    suspend operator fun invoke(): List<User>{
        delay(5000)
        return repository.getUserList()
    }
}