package Kotlin.K7_Coroutine

import kotlinx.coroutines.*

fun main() {
    println("Program Execution will now block")
    runBlocking {
        launch {
            delay(2000L)
            println("Tast from runBlocking")
        }

        GlobalScope.launch {
            delay(1000L)
            println("Task from Global Scope")
        }

        coroutineScope {
            launch {
                delay(2500L)
                println("Task from coroutineScope")

            }
        }
    }
println("Program execution will now continue")
}