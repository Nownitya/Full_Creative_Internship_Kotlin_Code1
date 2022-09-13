package operators

class Assignment {

    fun plus_Assign() {
        var a = 25
        a += 3
        println("Result = $a")

    }
    fun minus_Assign() {
        var a = 25
        a -= 6
        println("Result = $a")

    }
    fun times_Assign() {
        var a = 25
        a *= 25
        println("Result = $a")

    }
    fun div_Assign() {
        var a = 25
        a /= 1
        println("Result = $a")

    }
    fun mod_Assign() {
        var a = 25
        a %= 6
        println("result = $a")

    }

}

fun main() {
    println("----Assignment Operator----")
    val assign = Assignment()
    assign.plus_Assign()
    assign.minus_Assign()
    assign.times_Assign()
    assign.div_Assign()
    assign.mod_Assign()

}