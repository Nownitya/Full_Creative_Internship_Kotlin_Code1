package flowControl

class ForLoop {
    fun ex1() {
        //   Iterate Through a Range
        for (i in 1..5) {
            println(i)
        }

    }
    fun ex2() {
        //  Different Ways to Iterate Through a Range
        println("for (i in 1..5) println(i) =")
        for (i in 1..5) println(i)

        println()

        println("for (i in 5..1) println(i) =")
        for (i in 5..1) println(i)      //it prints nothing

        println()

        println("for (i in 5 downTo 1)   println(i) =")
        for (i in 5 downTo 1)   println(i)

        println()

        println("for (i in 1..5 step 2)  println(i) = ")
        for (i in 1..5 step 2)  println(i)

        println()

        println("for (i in 5 downTo 1 step 2) println(i) =")
        for (i in 5 downTo 1 step 2) println(i)

    }
    fun ex3() {
        //  Iterating Through an Array
        val language = arrayOf("Ruby", "Kotlin", "Java", "C", "C++", "Python")
        for (item in language) {
            println(item)

        }
    }
    fun ex4() {
        //  Iterating through an array with an index
        val language = arrayOf("Ruby", "Kotlin", "Java", "C", "C++", "Python")

        for (item in language.indices) {

            //  printing array elements having even index only
            if (item % 2 == 0) {
                println(language[item])
            }
        }
    }
    fun ex5() {
        //  Iterating Through a String
        var text = "Kotlin"

        for (letter in text) {
            println(letter)

        }
    }
    fun ex6() {
        //  iterate through a String with an index.
        var text = "Kotlin"

        for (item in text.indices) {
            println(text[item])

        }
    }
    fun ex7() {

    }


}

fun main() {
    val fl = ForLoop()
    println("Example 1")
    fl.ex1()
    println("Example 2")
    fl.ex2()
    println("Example 3")
    fl.ex3()
    println("Example 4")
    fl.ex4()
    println("Example 5")
    fl.ex5()
    println("Example 6")
    fl.ex6()






}