package flowControl

class Break{
    fun ex1() {
        //  break
        for (i in 1..10) {
            if (i == 5) {
                break

            }
            println(i)
        }
    }
    fun ex2() {
        //  Calculate Sum Until User enters 0

        var sum = 0
        var number: Int
        while (true) {
            println("Enter a number")
            number = readLine()!!.toInt()

            if (number == 0) {
                break

            }
            sum += number
        }
        println("sum = $sum")

    }
    fun ex3() {
        //  Labeled break
        //  Label in Kotlin starts with an identifier which is followed by @.
        first@ for (i in 1..4) {

            second@ for (j in 1..2) {
                println("i = $i; j = $j")

                if (i == 2) {
                    break@first


                }
            }
        }
    }
    fun ex4() {
        first@ for (i in 1..4) {
            second@ for (j in 1..2) {
                println("i = $i; j = $j")

                if (i == 2) {
                    break@second
                }
            }
        }

    }
}

fun main() {
    val br = Break()
    println("Example 1")
    br.ex1()
    println("Example 2")
    br.ex2()
    println("Example 3")
    br.ex3()
    println("Example 4")
    br.ex4()



}