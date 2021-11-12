package com.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.ArgumentMatchers.anyInt
import org.mockito.Mockito.`when`
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit.jupiter.SpringExtension

/**
 * Java-like version of Unit test
 */
@ExtendWith(SpringExtension::class)
class UserServiceLikeJavaTest {

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
        `when`(userRepository.findById(anyInt())).thenReturn(User(1, "name"))
        val result = userService.getUser(1)!!
        assertEquals(1, result.id)
        assertEquals("name", result.name)
    }

    @DisplayName("존재하지 않는 id인 경우, 사용자 가져오기 실패")
    @Test
    fun fail_findById() {
        `when`(userRepository.findById(anyInt())).thenReturn(null)
        val result = userService.getUser(1)
        assertNull(result)
    }

}