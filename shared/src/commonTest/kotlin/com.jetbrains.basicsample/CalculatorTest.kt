package com.jetbrains.basicsample

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CalculatorTest : FunSpec({
    test("sum") {
        Calculator.sum(1, 2).shouldBe(3)
    }
})