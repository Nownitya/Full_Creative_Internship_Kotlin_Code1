fun main() {
    val number = 5
    when (number) {
        1 -> println("One") //statement 1
        2 -> println("Two") //statement 2
        3 -> println("Three") //statement 3
        in 4..8 -> println("Number between 4 and 8") //statement 4
        !in 9..12 -> println("Number not in between 9 and 12") //statement 5
        else -> println("Number is not between 1 and 8") //statement 6
    }
}