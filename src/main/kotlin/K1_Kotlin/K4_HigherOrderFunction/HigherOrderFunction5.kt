package Kotlin.K4_HigherOrderFunction

//  Regular function definition
fun add(a: Int, b: Int): Int {
    var sum = a + b
    return sum
}

//  Higher-order function definition
fun higherfunc1(addfunc: (Int, Int) -> Int) {
    //  invoke regular function using local name
    val result = addfunc(4,7)
    println("The sum oof two number is: $result")
}

//  function declaration
fun mul(a: Int, b: Int): Int {
    return a * b
}

//  Higher-order function declaration
fun higherfunc(): ((Int, Int) -> Int) {
    return ::mul
}


fun main() {
    //  invoke higher order function
    higherfunc1(::add)

    //  invoke function and store the returned function into a variable
    val multiply = higherfunc()

    //  invokes the mul() function by passing arguments
    val result = multiply(4, 9)
    println("The multiplication of two number is : $result")
}