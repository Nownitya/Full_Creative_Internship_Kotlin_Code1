package Kotlin.K4_HigherOrderFunction

//lambda expression
val lambda = { println("Welcome to Full Creative") }

//  higher-order function
fun higherfunc(lmbd: () -> Unit) {  //  accepting lambda as parameter
    lmbd()                          //  invokes lambda expression
}
fun main() {

    //  invoke Higher-order function
    higherfunc(lambda)              //  Passing lambda as parameter
}