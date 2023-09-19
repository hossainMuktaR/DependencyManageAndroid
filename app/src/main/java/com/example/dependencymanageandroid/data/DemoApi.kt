package com.example.dependencymanageandroid.data

import javax.inject.Inject

class DemoApi{
    fun getAllUserFromApi(): List<User> {
        return User.userList
    }
}