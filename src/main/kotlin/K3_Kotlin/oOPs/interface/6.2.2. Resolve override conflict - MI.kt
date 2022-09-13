package oOPs.`interface`

interface A1 {
    fun callMe() {
        println("From Interface A")

    }
}

interface B1 {
    fun callMe() {
        println("From Interface B")

    }
}
    //  class Child1: A1, B1
    /*  Class 'Child1' must override public open fun callMe(): Unit defined in oOPs.
    `interface`.A1 because it inherits multiple interface methods of it  */

class Child1 : A1, B1 {
    override fun callMe() {
        super<A1>.callMe()
        super<B1>.callMe()

    }
}

fun main() {
    val obj = Child1()

    obj.callMe()
}
