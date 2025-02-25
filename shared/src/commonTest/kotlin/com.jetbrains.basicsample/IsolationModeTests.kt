package com.jetbrains.basicsample

import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class IsolationModeTests : FunSpec({
    // Works on JVM, does not work on K/N
    isolationMode = IsolationMode.InstancePerRoot
    var count = 0

    test("isolation mode test 1") {
        count.shouldBe(0)
        count++
        count.shouldBe(1)
    }

    test("isolation mode test 2") {
        count.shouldBe(0)
        count++
        count.shouldBe(1)
    }
})