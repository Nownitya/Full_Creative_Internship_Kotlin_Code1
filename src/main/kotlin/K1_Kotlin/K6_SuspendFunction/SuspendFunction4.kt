package Kotlin.K6_SuspendFunction

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import sun.reflect.ConstantPool


suspend fun helloSuspend() {
    println("Hello World")
}

fun main()= runBlocking {
    println("Start")
    val a= launch() {
        delay(1000)
        helloSuspend()
        println("Inside Launch")
    }
    println("Finished")
    a.join()
}
