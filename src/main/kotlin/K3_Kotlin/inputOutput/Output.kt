package inputOutput
class Output{
    fun ex1() {
        println("Kotlin Program")
    }
    fun ex2() {     //println() and print()
        println("Hello")
        println("World")
        print("Hello")
        print("world")

    }
    fun ex3() {     //  Print Variable and Literals
        var score: Int = 256
        println("Score")
        println("${score}")
        println("Score = ${score}")
        println("${score + score}")
        println(256)

    }
}

fun main(args: Array<String>) {
    var output = Output()
    output.ex1()
    output.ex2()
    output.ex3()

}