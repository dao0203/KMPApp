package com.example.kmpapp

import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): List<String> = buildList {
        add("Hello, ${platform.name}!")
        add("Random number: ${platform.name}")
    }
}