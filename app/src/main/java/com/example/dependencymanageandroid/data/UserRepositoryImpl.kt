package com.example.dependencymanageandroid.data

import com.example.dependencymanageandroid.domain.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val api: DemoApi
): UserRepository {
    override fun getUserList(): List<User> {
        return api.getAllUserFromApi()
    }

}