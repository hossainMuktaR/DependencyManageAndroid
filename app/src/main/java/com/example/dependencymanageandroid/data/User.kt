package com.example.dependencymanageandroid.data

data class User(
    val name: String,
    val bio: String,
    val id: Int
){
    companion object{
        val userList = listOf(
            User("UserName1","Android Developer", 1),
            User("UserName2","Android Developer", 2),
            User("UserName3","Android Developer", 3),
            User("UserName4","Android Developer", 4),
            User("UserName5","Android Developer", 5),
            User("UserName6","Android Developer", 6),
            User("UserName7","Android Developer", 7),
            User("UserName8","Android Developer", 8),
            User("UserName9","Android Developer", 9),
            User("UserName10","Android Developer", 10),
        )
    }
}

