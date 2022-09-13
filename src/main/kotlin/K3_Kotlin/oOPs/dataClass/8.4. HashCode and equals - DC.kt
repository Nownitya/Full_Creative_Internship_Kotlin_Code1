package oOPs.dataClass

data class User3(val name: String, val age: Int)

fun main() {
    val u1 = User("Ram", 22)
    val u2 = u1.copy()
    val u3 = u1.copy(name = "Arjun")

    println("U1 hashCode = ${u1.hashCode()}")
    println("U2 hashCode = ${u2.hashCode()}")
    println("U3 hashCode = ${u3.hashCode()}")

    if (u1.equals(u2) == true) {
        println("U1 is equals to U2.")
    } else {
        println("U1 is not equal to U2.")
    }
    if (u1.equals(u3) == true) {
        println("U1 is equal to U3")
    } else {
        println("U1 is not equal to U3")
    }

    println()
    println(u1)
    println(u2)
    println(u3)


}