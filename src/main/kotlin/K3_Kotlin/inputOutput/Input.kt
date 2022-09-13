package inputOutput

import java.util.*

class Input{
    fun ex1() {
        println("Enter your Input")
        val stringInput = readLine()!!
        println("You entered : ${stringInput}")
    }
    fun ex2() {
        //  Create a instance which take input from standard input(Keyboard).
        val reader = Scanner(System.`in`)
        println("Enter a number")

        //  nextInt() reads the next integer from the keyboard.
        var integer: Int = reader.nextInt()

        println("You entered : $integer")
    }
}

fun main() {
    val input = Input()
    input.ex1()
    input.ex2()


    /*   To get Long, Float, double and Boolean input from the user, you can use nextLong(),
         nextFloat(), nextDouble() and nextBoolean() methods respectively.

   */

}
