package com.example.dependencymanageandroid.data

import javax.inject.Inject

class DemoApi @Inject constructor(){
    fun getAllUserFromApi(): List<User> {
        return User.userList
    }
}