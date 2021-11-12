package com.example

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk

class UserServiceBehaviorSpecTest : BehaviorSpec() {

    private val userRepository = mockk<UserRepository>()
    private lateinit var userService: UserService

    init {

        beforeTest {
            userService = UserService(userRepository)
        }

        given("사용자 ID가") {
            `when`("존재한다면") {
                then("사용자 가져오기 성공") {
                    every { userRepository.findById(any()) } returns User(1, "name")
                    val result = userService.getUser(1)!!
                    result.id shouldBe 1
                    result.name shouldBe "name"
                }
            }

            `when`("존재하지 않는 ID라면") {
                then("사용자 가져오기 실패") {
                    every { userRepository.findById(any()) } returns null
                    val result = userService.getUser(1)
                    result shouldBe null
                }
            }
        }
    }
}