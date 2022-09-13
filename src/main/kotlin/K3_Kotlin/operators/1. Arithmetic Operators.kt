package operators

class Arithmetic{
    private val num1 = 65.26
    private val num2 = 33.86


    fun addition() {
        val result: Double = num1 + num2
        println("num1 + num2 = $result")
        println(num1.plus(num2))


    }
    fun subtraction() {
        val result: Double = num1 - num2
        println("num1 - num2 = $result")
        println(num1.minus(num2))

    }
    fun multiplication() {
        val result: Double = num1 * num2
        println("num1 * num2 = $result")
        println(num1.times(num2))

    }
    fun division() {
        val result: Double = num1 / num2
        println("num1 / num2 = $result")
        println(num1.div(num2))

    }
    fun modulus() {
        val result: Double = num1 / num2
        println("num1 % num2 = $result")
        println(num1.mod(num2))

    }

}

fun main() {

    println("----Operators----")
    println("--Arithmetic Operators--")
    val arithmetics = Arithmetic()
    println("Addition Operator")
    arithmetics.addition()
    println("Subtraction Operator")
    arithmetics.subtraction()
    println("Multiplication Operator")
    arithmetics.multiplication()
    println("Division Operator")
    arithmetics.division()
    println("Modulus Operator")
    arithmetics.modulus()

}