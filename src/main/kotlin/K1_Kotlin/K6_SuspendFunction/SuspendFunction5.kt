package Kotlin.K6_SuspendFunction

import kotlinx.coroutines.*

var functionCalls = 0

fun main() {
    GlobalScope.launch{ completeMessage() }
    GlobalScope.launch { improveMessage() }
    println("Hello ")
    Thread.sleep(2000L)
    println("There have been $functionCalls calls so far.")

}
suspend fun completeMessage() {
    delay(500L)
    println("World")
    functionCalls++
}
suspend fun improveMessage() {
    delay(1000L)
    println("Suspend functions are best.")
    functionCalls++
}
