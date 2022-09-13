package oOPs.nestedAndInnerClass

class outer {
    val a = "Outside Nested Class."

    class Nested {
        val b = "Inside Nested Class"
        fun callMe() = "Function call from inside Nested Class."

    }
}

fun main() {
    //  Accessing member of Nested Class
    println(outer.Nested().b)

    //  creating object of Nested Class
    val nested = outer.Nested()
    println(nested.callMe())

}
