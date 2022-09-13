package functions

import java.math.BigInteger

fun main() {
    //  Find factorial of a Number using Recursion
    println("Example 1")

    val number1 = 4
    val result: Long
    result = factorial1(number1)

    //  Tail Recursion
    println("Example 2")

    val n = 100
    val first = BigInteger("0")
    val second = BigInteger("1")
    println(fibonacci(n, first, second))

    //  Factorial Using Tail Recursion
    println("Example 3")

    val number2 = 5
    println("Factorial of $number2 = ${factorial2(number2)})")

}
fun factorial1(n: Int): Long {
    return if (n == 1) n.toLong() else n * factorial1(n - 1)

}

fun factorial2(n: Int, run: Int = 1): Long {
    return if (n == 1) run.toLong() else factorial2(n-1, run*n)

}

tailrec fun fibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0) a else fibonacci(n - 1, b, a + b)

}