package Functional.HigerOrder

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a,b)
}

fun sum(a: Int, b: Int): Int = a + b

fun main() {
    val sumResult = calculate(4, 6, ::sum)
    val mulResult = calculate(4,7){c,d -> c * d}
    println("Sum = $sumResult, Multiplication =  $mulResult")


}