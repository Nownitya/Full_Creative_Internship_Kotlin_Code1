package oOPs.dataClass

data class User(val name: String, val age: Int)

fun main() {
    val ram = User("Ram", 22)
    println("Name: ${ram.name}")
    println("Age: ${ram.age}")

}