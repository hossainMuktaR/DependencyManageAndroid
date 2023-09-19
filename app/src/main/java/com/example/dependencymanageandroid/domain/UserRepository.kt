package com.example.dependencymanageandroid.domain

import com.example.dependencymanageandroid.data.User

interface UserRepository {
    fun getUserList(): List<User>
}