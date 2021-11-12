package com.example

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.ArgumentMatchers
import org.mockito.Mockito
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
class UserServicePartlyKotest {

    private lateinit var userService: UserService

    @MockBean
    private lateinit var userRepository: UserRepository

    @BeforeEach
    fun setUp() {
        userService = UserService(userRepository)
    }

    @DisplayName("존재하는 id인 경우 사용자 가져오기 성공")
    @Test
    fun success_findById() {
        Mockito.`when`(userRepository.findById(ArgumentMatchers.anyInt())).thenReturn(User(1, "name"))
        val result = userService.getUser(1)!!
        result.id shouldBe 1
        result.name shouldBe "name"
    }

    @DisplayName("존재하지 않는 id인 경우, 사용자 가져오기 실패")
    @Test
    fun fail_findById() {
        Mockito.`when`(userRepository.findById(ArgumentMatchers.anyInt())).thenReturn(null)
        val result = userService.getUser(1)
        result shouldBe null
    }
}