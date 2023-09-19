package com.example.dependencymanageandroid.domain

import com.example.dependencymanageandroid.data.User
import kotlinx.coroutines.delay
import javax.inject.Inject

class UserListUseCase @Inject constructor(
    private val repository: UserRepository
) {
    suspend operator fun invoke(): List<User>{
        delay(5000)
        return repository.getUserList()
    }
}