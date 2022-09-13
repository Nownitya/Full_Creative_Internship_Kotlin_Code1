package Kotlin

fun calculate (a:Double,b:Double, fn:(Double,Double)->Double) {
    val result = fn(a, b)
    println(result)
}
fun sum(a: Double, b: Double): Double {
    return a+b

}
fun main() {

    calculate(4.0,6.0,::sum)



}