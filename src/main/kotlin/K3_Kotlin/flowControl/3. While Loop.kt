package flowControl

class WhileLoop{
    fun ex1() {
        var a = 1
        while (a <= 5) {
            println("Line $a")
            ++a
        }
    }
    fun ex2() {
        //  Infinite while Loop
        var a = 1

        while (true) {
            println(a)
        }
    }
    fun ex3() {
        //  Compute sum of Natural Numbers
        var sum = 0
        var a = 100

        while (a != 0) {
            sum +=a
            --a
        }
        println("sum = $sum")

    }
    fun ex4() {
        //  Kotlin do...while Loop

        /*  The program below calculates the sum of numbers entered by the user until user enters 0.
            */
        var sum: Int = 0
        var input: String

        do {
            println("Enter an Integer")
            input = readLine()!!
            sum += input.toInt()

        } while (input != "0")
        println("Sum = $sum")
    }
}

fun main() {
    val wl = WhileLoop()
    println("Example 1")
    wl.ex1()
    println("Example 2")
//    wl.ex2()
    println()
    println("Example 3")
    wl.ex3()
    println("Example 4")
    wl.ex4()


}