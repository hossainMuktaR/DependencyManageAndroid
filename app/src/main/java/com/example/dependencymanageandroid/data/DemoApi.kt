package com.example.dependencymanageandroid.data

class DemoApi {
    fun getAllUserFromApi(): List<User> {
        return User.userList
    }
}