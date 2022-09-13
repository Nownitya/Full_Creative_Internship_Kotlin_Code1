package Kotlin.K2_Extension_Function

fun main() {

    var name = mutableListOf<String>()

    name.apply {
        add("Ram")
        add("Mohan")
        add("Sohan")
    }

    println(name)

}