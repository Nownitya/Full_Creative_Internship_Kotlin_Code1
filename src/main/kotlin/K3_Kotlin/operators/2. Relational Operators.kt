package operators

class Relational {
    var a: Int = 25
    var b: Int = 85

    fun greater_than() {
        println("Is a greater than b?")
        if (a > b) {
            println("Yes")
        } else {
            println("No")
        }


    }

    fun less_than() {
        println("Is a less than b?")
        if (a < b) {
            println("True")
        } else {
            println("False")
        }

    }

    fun greater_or_equals() {
        println("Is a greater than or equals to b?")
        if (a >= b) {
            println("Yes")
        } else {
            println("No")
        }

    }

    fun less_equals() {
        println("Is a less than or equals to b?")
        if (a <= b) {
            println("Yes")
        } else {
            println("No")
        }

    }

    fun is_equal() {
        println("Is a equal to b?")
        if (a == b) {
            println("Yes")
        } else {
            println("No")
        }


    }

    fun not_equal() {
        println("Is a not equal to b?")
        if (a != b) {
            println("Yes")
        } else {
            println("No")
        }

    }

}

fun main(args: Array<String>) {

    println("----Relational / Comparison and Equality Operators----")
    var relational = Relational()
    println("Greater Than")
    relational.greater_than()
    println("Less Than")
    relational.less_than()
    println("greater or Equal to")
    relational.greater_or_equals()
    println("Less than or equal to")
    relational.less_equals()
    println("is Equal to")
    relational.is_equal()
    println("not Equal to")
    relational.not_equal()

}