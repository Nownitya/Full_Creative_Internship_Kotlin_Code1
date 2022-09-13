package functions

//class Functions{
//    fun ex1() {
//        //  Standard Library Function
//        //  print() is a library function that prints message to the standard output stream (monitor).
//        //  sqrt() returns square root of a number (Double value)
//
//        var number = 5.5
//
//        println("result = ${Math.sqrt(number)}")
//
//    }
//    fun callme() {
//        //  User-defined Functions
//        //  Simple Function Program
//
//        println("Printing from callme() function.")
//        println("Printing from inside.")
//
//
//
//    }
//}

fun callme() {
    //  User-defined Functions
    //  Simple Function Program

    println("Printing from callme() function.")
    println("Printing from inside.")

}

//  Add Two Numbers Using Function
fun addNumber(n1: Double, n2: Double): Int {
    val sum = n1 + n2
    val sumInteger = sum.toInt()
    return sumInteger


}
fun main() {
//    val fu = Functions()
//    println("Example 1")
//    fu.ex1()
//    println("Example 2")
//    fu.callme()

    var number = 5.5
    println("Example 1")
    println("Result = ${Math.sqrt(number)}")

    println("Example 2")
    callme()
    println("Printing outside from callme() function.")

    println()
    println("Example 3")
    println()
    print("Enter first number: ")
    val number1 = readLine()!!.toDouble()
    print("Enter Second number: ")
    val number2 = readLine()!!.toDouble()

    val result: Int = addNumber(number1, number2)
    println("result = $result")

    println()
    println("Example 4")
    println(getName("Rohan", "Singh"))


}

fun getName(firstName: String, lastName: String):String = "$firstName $lastName"
