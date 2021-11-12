package com.example

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk


class UserServiceDescribeSpecTest : DescribeSpec() {


    private val userRepository = mockk<UserRepository>()
    private lateinit var userService: UserService

    init {

        beforeTest {
            userService = UserService(userRepository)
        }

        describe("존재하는 ID인 경우") {
            it("사용자 가져오기 성공") {
                every { userRepository.findById(any()) } returns User(1, "name")
                val result = userService.getUser(1)!!
                result.id shouldBe 1
                result.name shouldBe "name"
            }
        }

        describe("존재하지 않는 ID인 경우") {
            it("사용자 가져오기 실패") {
                every { userRepository.findById(any()) } returns null
                val result = userService.getUser(1)
                result shouldBe null
            }
        }
    }
}