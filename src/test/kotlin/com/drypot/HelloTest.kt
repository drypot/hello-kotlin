package com.drypot

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HelloTest {

    @Test
    internal fun hello() {
        println("Hello Kotlin")
    }

    @Test
    internal fun printName() {
        var name: String = "Snowman"
        println(name)
    }

}
