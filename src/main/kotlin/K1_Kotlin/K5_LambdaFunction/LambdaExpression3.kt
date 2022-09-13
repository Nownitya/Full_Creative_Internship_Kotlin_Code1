package Kotlin.K5_LambdaFunction


class Test {
    fun ex1() {
        val greeting = { println("Hello!") }

        // invoking function
        greeting()
    }

    //  Lambda with return type and Return Type
    fun ex2() {
        val product = {a:Int, b:Int -> a * b}
        val result = product(9, 5)
        println(result)

    }
}
fun main() {

    val la = Test()
    la.ex1()
    la.ex2()


}