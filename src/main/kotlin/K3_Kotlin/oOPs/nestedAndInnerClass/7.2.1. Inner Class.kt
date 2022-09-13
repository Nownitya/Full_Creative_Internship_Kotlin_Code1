package oOPs.nestedAndInnerClass

class Outer1 {

    val foo = "Outside Nested class"

/*
        class Nested {
        //  Error! Cannot access member of outer class.
        fun callMe() = foo
    }
*/

    inner class Inner1 {
        fun callMe() = foo

    }



}

fun main() {

    val outer = Outer1()
//    println(outer.Nested.callme())

    println("Using Outer Object: ${outer.Inner1().callMe()}")

    val inner = Outer1().Inner1()
    println("Using Inner Class: ${inner.callMe()}")

}