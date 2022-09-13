package oOPs.dataClass

data class User2(val name: String, val age: Int)

fun main() {
    val u1 = User2("Ram", 22)
    println(u1.toString())
    
}
