package Kotlin.K6_SuspendFunction

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    repeat(100) {
        launch {
            delay(5000L)
            println(".")
        }
    }

}