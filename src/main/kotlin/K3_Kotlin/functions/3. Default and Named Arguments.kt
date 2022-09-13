package functions

fun displayBorder1(character: Char = '=', length: Int = 15) {

    for (i in 1..length) {
        print(character)
    }

}
fun displayBorder2(character: Char = '=', length: Int = 15) {
    for (i in 1..length) {
        print(character)
    }

}

fun main() {
    println("Example 1")
    println("Output when no argument is passed: ")
    displayBorder1()

    println("\n\n'*' is used as a first argument")
    println("Output when first argument is passed:")
    displayBorder1('*')

    println("\n\n'*' is used as a first argument")
    println("5 is used as second argument")
    println("Output when both argument are passed")
    displayBorder1('*', 5)

    println()
    println("Example 2")
    displayBorder2(length = 5)

}


