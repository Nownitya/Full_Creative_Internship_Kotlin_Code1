package Kotlin.K2_Extension_Function

fun String.removeFirstLastChar(): String = this.substring(1, this.length - 1)

fun main() {
    val myString = "Full Creative"
    val result = myString.removeFirstLastChar()
    println("Characters : $result")
}


