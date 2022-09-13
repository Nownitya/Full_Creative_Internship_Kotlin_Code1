package Kotlin.K3_ScopedFunction

fun main() {
    val list = mutableListOf<Int>(1,2,4,5,8,9,14)

    list.also {
        it.add(3)
        it.remove(5)
    }
    println(list)

}