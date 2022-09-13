package oOPs.`interface`

interface MyInterface {
    val test: Int
    fun foo(): String
    fun hello() {
        println("Hello to all")

    }
}

class InterfaceImp : MyInterface {
    override val test: Int = 22
    override fun foo() = "LOL"

}

fun main() {
    val obj = InterfaceImp()

    println("Test = ${obj.test}")
    print("Calling Hello")

    obj.hello()

    print("Calling and printing foo(): ")
    println("${obj.foo()}")

}