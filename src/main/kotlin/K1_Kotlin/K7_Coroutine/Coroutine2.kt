package Kotlin.K7_Coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val job1 = launch {
            delay(2000L)
            println("Job1 Launched")
        }
        job1.invokeOnCompletion { println("Job1 completed") }

        delay(1000L)
        println("Job will be cancelled")
        job1.cancel()
    }

}