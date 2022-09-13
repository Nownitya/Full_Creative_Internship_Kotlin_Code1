package Kotlin.K5_LambdaFunction


// with type annotation in lambda expression
val sum1 = {a: Int, b: Int -> a + b }

// without type annotation in lambda expression
val sum2: (Int, Int)->Int = {a,b-> a + b}

val sum3 = {
    val a = 56
    "Hello World"
    4
}

fun main() {
    val result1 = sum1(6, 8)
    val result2 = sum2(4, 7)

    println("Sum1 = $result1")
    println("Sum2 = $result2")

    println("Sum = ${ sum1(5, 10) }")




}

