package com.jetbrains.basicsample

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class GreetingTest : FunSpec({
    test("example") {
        Greeting().greeting().contains("Android").shouldBe(true)
    }
})