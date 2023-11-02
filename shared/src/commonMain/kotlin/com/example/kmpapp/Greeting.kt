package com.example.kmpapp

import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        val firstWord = if (Random.nextBoolean()) "Hi!" else "Hello!"
//        return "Hello, ${platform.name}!"
        return "$firstWord $num, ${platform.name}!"
    }
}