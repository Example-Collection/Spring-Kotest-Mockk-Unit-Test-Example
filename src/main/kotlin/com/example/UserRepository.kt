package com.example

import org.springframework.stereotype.Repository

@Repository
class UserRepository {

    private val users: MutableMap<Int, User> = mutableMapOf()

    init {
        for(i in 1..10) {
            users[i] = User(i, "name$i")
        }
    }

    fun findById(id: Int) = users[id]
}