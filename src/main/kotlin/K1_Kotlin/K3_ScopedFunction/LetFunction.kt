package Kotlin.K3_ScopedFunction

fun main() {
    var a: Int? = null
    a?.let {
        println(it)
    }

    a= 2
    a?.let {
        println(it)
    }




}