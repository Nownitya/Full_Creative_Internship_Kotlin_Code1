package Kotlin.K6_SuspendFunction

import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import java.lang.Thread.sleep
import kotlin.system.measureTimeMillis


fun main() {

    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    runBlocking {
        val time = measureTimeMillis {
            list.map {value ->
                async {
//                    sleep(2000)
                    delay(2000)
                    println("Procedding value: $value")
                    value
                }
            }.awaitAll()
        }
        println("Processed in $time ms")

    }
}