package oOPs.companianObjects

    //  access members of a class.

class Person1 {
    fun callMe() = println("I'm called.")

}

fun main() {
    val p1 = Person1()

    //  calling callMe() function using object p1.
    p1.callMe()

}