package oOPs.`interface`

interface A {

    fun callMe() {
        println("From Interfaca A")

    }
}
interface B {
    fun callMeTo() {
        println("From Interface B")

    }
}

//  implements two interface A and B

class Child: A, B

fun main() {
    val obj = Child()

    obj.callMe()
    obj.callMeTo()

}