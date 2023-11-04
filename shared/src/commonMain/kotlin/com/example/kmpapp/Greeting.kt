package com.example.kmpapp

import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    private val daysPhrase = "These are only ${daysUntilNewYear()} days until New Year! 🎉"

    fun greet(): List<String> = buildList {
        add("Hello, ${platform.name}!")
        add("Random number: ${platform.name}")
        add(daysPhrase)
    }
}