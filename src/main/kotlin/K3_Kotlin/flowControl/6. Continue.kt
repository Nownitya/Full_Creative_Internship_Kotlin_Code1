package flowControl

class Continue{
    fun ex1() {
        //  Continue
        for (i in 1..5) {
            println("$i Always Printed.")
            if (i > 1 && i < 5) {
                continue

            }
            println("$i Not always printed.")

        }
    }
    fun ex2() {
        //  Calculate Sum of Positive Numbers Only
        var number: Int
        var sum = 0
        for (i in 1..6) {
            print("Enter an integer: ")
            number = readLine()!!.toInt()

            if (number <= 0) {
                continue

            }
            sum += number
        }
        println("sum = $sum")
    }
    fun ex3() {
        //  Labeled continue
        //  Label in Kotlin starts with an identifier
        //  can skip the execution of codes of the specific loop for that iteration.

        here@ for (i in 1..5) {
            for (j in 1..4) {
                if (i == 3 || j == 3) {
                    continue@here

                }
                println("i = $i; j = $j")

            }
        }
    }

}

fun main() {
    val con = Continue()
    println("Example 1")
    con.ex1()
    println("Example 2")
    con.ex2()
    println("Example 3")
    con.ex3()






}