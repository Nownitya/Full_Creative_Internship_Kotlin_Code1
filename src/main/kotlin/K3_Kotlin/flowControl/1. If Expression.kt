package flowControl

class IfExpression {
    fun ex1() {
        //  if...else
        val a: Int = -125

        if (a > 0) {
            println("Number is Positive")

        } else {
            println("Number is Negative")
        }

    }
    fun ex2() {
        val a = -25
        val result = if (a < 0) "Positive Number" else "Negative Number"
        println(result)

    }
    fun ex3() {
        //  if..else..if Ladder
        val a = 0

        if (a > 0) {
            println("Number is Positive")

        } else if (a < 0) {
            println("Number is Negative")

        } else {
            println("Number is 0")
        }

    }
    fun ex4() {
        //  Nested if Expression
        val a = 56
        val b = 83
        val c = -3

        val score: Int = if (a > b) {
            if (a > b) {
                a
            } else {
                b
            }
        } else {
            if (b > c) {
                b

            } else {
                c
            }
        }

        println(score)

    }


}

fun main() {
    val ifExp = IfExpression()
    println("Example 1")
    ifExp.ex1()
    println("Example 2")
    ifExp.ex2()
    println("Example 3")
    ifExp.ex3()
    println("Example 4")
    ifExp.ex4()



}
