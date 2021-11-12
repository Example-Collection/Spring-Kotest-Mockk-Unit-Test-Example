package com.example

import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository
) {
    fun getUser(id: Int) = userRepository.findById(id)
}