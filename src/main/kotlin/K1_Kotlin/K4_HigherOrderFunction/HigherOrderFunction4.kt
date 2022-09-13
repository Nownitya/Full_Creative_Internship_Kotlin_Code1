package Kotlin.K4_HigherOrderFunction

//  Regular function defination
fun display(s: String): Unit {
    println(s)
}

//  higher order function definition
fun higherfun(str: String, myfunc: (String) -> Unit) {
    //  invoke regular function using local name
    myfunc(str)
}
fun main(args: Array<String>) {
    //  invoke higher order function
    higherfun("Hell Full Creative",::display)
}
