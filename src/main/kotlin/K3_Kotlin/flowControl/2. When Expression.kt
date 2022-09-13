package flowControl

class WhenExpression{
    fun ex1() {
        //  when Construct
        //  when Expression
        val a = 15
        val b = 6

        println("Enter Operator Either +, -, *, /")
        val operator = readLine()

        val result = when (operator) {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            "/" -> a / b

            else -> "$operator operator is invalid Operator"

        }
        println("Result : $result")

    }
    fun ex2() {
        val a = 12
        val b = 8

        println("Print Operator either : +, -, *, /")
        val operator = readLine()
        when (operator) {
            "+" -> println("$a + $b = ${a + b}")
            "-" -> println("$a - $b = ${a - b}")
            "*" -> println("$a * $b = ${a * b}")
            "/" -> println("$a / $b = ${a / b}")
            else -> println("Inavalid Operator")

        }
    }
    fun ex3() {

        println("Enter 1 to 7")
        val day = readLine()
        when (day) {
            "1" -> println("Monday")
            "2" -> println("Tuesday")
            "3" -> println("Wednesday")
            "4" -> println("Thursday")
            "5" -> println("Friday")
            "6" -> println("Saturday")
            "7" -> println("Sunday")
            else -> println("Wrong Input")
        }

    }
    fun ex4() {

        val day = 2
        when (day) {
            1, 2, 3, 4, 5 -> println("Weekdays")
            else -> println("Weekends")

        }
    }
    fun ex5() {
        //  Combine two or more branch conditions with a comma
        val n = -2

        when (n) {
            1, 2, 3, 4 -> println("n is a positive integer")
            0 -> println("n is zero")
            -1, -2,-3 -> println("n is a negative integer")
        }

    }
    fun ex6() {
        //  Check value in the range
        val n = 55

        when (n) {
            in 1..10 -> println("A positive number less than 11")
            in 11..100 -> println("A positive number between 11 to 100 ")

        }

    }
    fun ex7() {
        //  Use expressions as branch condition

        val a = 11
        val b = "15"
        when (b) {
            "cat" -> println("Cat?")
            15.toString() -> println("Not the same")
            a.toString() -> println("It's Eleven")

        }
    }



}

fun main(args: Array<String>) {
    val we = WhenExpression()
//    println("Example 1")
//    we.ex1()
//    println("Example 2")
//    we.ex2()
//    println("Example 3")
//    we.ex3()
//    println("Example 4")
//    we.ex4()
//    println("Example 5")
//    we.ex5()
//    println("Example 6")
//    we.ex6()
    println("Example 7")
    we.ex7()





}