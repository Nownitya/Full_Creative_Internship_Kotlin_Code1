package Kotlin.K4_HigherOrderFunction

//  Lambda function
var lambda2 = {a:Int, b:Int -> a + b}

//  Higher order function
fun higherfunc(lmbd: (Int, Int) -> Int) {       //Accepting lambda as parameters

    var result = lmbd(2, 5)      //  invokes the lambda expression by passing parameter
    println("The sum of two number is: $result")

}

fun main() {
    higherfunc(lambda2)
}