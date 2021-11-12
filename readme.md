## Spring 에서 Kotest, Mockk를 사용해 단위 테스트 해보기

### 정리 글: <a href="https://github.com/sang-w0o/Study/blob/master/Backend%20Frameworks/Spring%20%EB%BF%8C%EC%85%94%EB%B3%B4%EA%B8%B0/Kotest%2C%20Mockk%EB%A1%9C%20Spring%20%EB%8B%A8%EC%9C%84%20%ED%85%8C%EC%8A%A4%ED%8A%B8%20%EC%9E%91%EC%84%B1%ED%95%98%EA%B8%B0.md">링크</a>

- (1) 가장 Java 스러운 코드 스타일로 작성: <a href="https://github.com/Example-Collection/Spring-Kotest-Mockk-Unit-Test-Example/blob/master/src/test/kotlin/com/example/UserServiceLikeJavaTest.kt">UserServiceLikeJavaTest.kt</a>
- (2) Kotest Assertions 도입: <a href="https://github.com/Example-Collection/Spring-Kotest-Mockk-Unit-Test-Example/blob/master/src/test/kotlin/com/example/UserServicePartlyKotest.kt">UserServicePartlyKotest.kt</a>
- (3) Mockk 도입: <a href="https://github.com/Example-Collection/Spring-Kotest-Mockk-Unit-Test-Example/blob/master/src/test/kotlin/com/example/UserServiceMockkTest.kt">UserServiceMockkTest.kt</a>
- (4) Kotest Testing Style 하나씩 훑어보기
  - Describe Spec: <a href="https://github.com/Example-Collection/Spring-Kotest-Mockk-Unit-Test-Example/blob/master/src/test/kotlin/com/example/UserServiceDescribeSpecTest.kt">UserServiceDescribeSpecTest.kt</a>
  - Should Spec: <a href="https://github.com/Example-Collection/Spring-Kotest-Mockk-Unit-Test-Example/blob/master/src/test/kotlin/com/example/UserServiceShouldSpecTest.kt">UserServiceShouldSpecTest.kt</a>
  - String Spec: <a href="https://github.com/Example-Collection/Spring-Kotest-Mockk-Unit-Test-Example/blob/master/src/test/kotlin/com/example/UserServiceStringSpecTest.kt">UserServiceStringSpecTest.kt</a>
  - Behavior Spec: <a href="https://github.com/Example-Collection/Spring-Kotest-Mockk-Unit-Test-Example/blob/master/src/test/kotlin/com/example/UserServiceBehaviorSpecTest.kt">UserServiceBehaviorSpecTest.kt</a>
  - Expect Spec: <a href="https://github.com/Example-Collection/Spring-Kotest-Mockk-Unit-Test-Example/blob/master/src/test/kotlin/com/example/UserServiceExpectSpecTest.kt">UserServiceExpectSpecTest.kt</a>
  - Annotation Spec: <a href="https://github.com/Example-Collection/Spring-Kotest-Mockk-Unit-Test-Example/blob/master/src/test/kotlin/com/example/UserServiceAnnotationSpecTest.kt">UserServiceAnnotationSpecTest.kt</a>