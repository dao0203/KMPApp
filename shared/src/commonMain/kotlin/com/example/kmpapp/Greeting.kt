package com.example.kmpapp

import com.example.kmpapp.data.RocketComponent
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.random.Random
import kotlin.time.Duration.Companion.seconds

class Greeting {
    private val platform: Platform = getPlatform()

    private val daysPhrase = "These are only ${daysUntilNewYear()} days until New Year! 🎉"

    private val rocketComponent = RocketComponent()

//    fun greet(): List<String> = buildList {
//        add("Hello, ${platform.name}!")
//        add("Random number: ${platform.name}")
//        add(daysPhrase)
//    }

    fun greet(): Flow<String> = flow {
        emit (if (Random.nextBoolean()) "Hi!" else "Hello!")
        delay(1.seconds)
        emit("Guess what it is! > ${platform.name.reversed()}")
        delay(1.seconds)
        emit(daysPhrase)
        delay(1.seconds)
        while (true){
            emit(rocketComponent.launchPhrase())
            delay(1.seconds)
        }
    }
}