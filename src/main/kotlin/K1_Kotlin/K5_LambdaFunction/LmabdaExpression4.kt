package Kotlin.K5_LambdaFunction

fun main() {
    val a = 5
    val tripple: (Int) ->Int = {a:Int -> a * 3}
    println(tripple(a))
}