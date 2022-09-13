package oOPs.dataClass

data class User1(val name: String, val age: Int)

fun main() {
    val u1 = User1("Ram", 22)

    //  using copy function to create an object
    val u2 = u1.copy(name = "Rohan", age = 23)
    println("u1: name = ${u1.name}, age = ${u1.age}")
    println("u2: name = ${u2.name}, age = ${u2.age}")


}