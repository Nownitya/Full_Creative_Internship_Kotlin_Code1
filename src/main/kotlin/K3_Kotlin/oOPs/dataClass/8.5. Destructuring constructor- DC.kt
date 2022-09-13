package oOPs.dataClass

data class User4(val name: String, val age: Int, val gender: String)

fun main() {
    val u1 = User4("Ram", 22, "Male")

    val (name, age, gender) = u1

    println("Name: " + u1.name)
    println("Age:" + u1.age)
    println("Gender" + u1.gender)

    println()
    /*  compiler generates componentN() functions all properties for a data class.  */

    println(u1.component1())
    println(u1.component2())
    println(u1.component3())







}