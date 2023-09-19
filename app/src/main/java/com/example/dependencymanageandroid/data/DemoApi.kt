package com.example.dependencymanageandroid.data

import org.koin.core.annotation.Single

@Single
class DemoApi {
    fun getAllUserFromApi(): List<User> {
        return User.userList
    }
}