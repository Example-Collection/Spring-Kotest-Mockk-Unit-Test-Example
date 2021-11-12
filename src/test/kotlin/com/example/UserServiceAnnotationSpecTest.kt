package com.example

import io.kotest.core.spec.DisplayName
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk

@DisplayName("사용자 ID 조회 테스트")
class UserServiceAnnotationSpecTest : AnnotationSpec() {

    private val userRepository = mockk<UserRepository>()
    private lateinit var userService: UserService

    @BeforeEach
    fun setUp() {
        userService = UserService(userRepository)
    }

    @Test
    fun successIfAvailableId() {
        every { userRepository.findById(any()) } returns User(1, "name")
        val result = userService.getUser(1)!!
        result.id shouldBe 1
        result.name shouldBe "name"
    }

    @Test
    fun failIfInvalidId() {
        every { userRepository.findById(any()) } returns null
        val result = userService.getUser(1)
        result shouldBe null
    }
}