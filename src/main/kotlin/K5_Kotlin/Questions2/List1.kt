fun main() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println("List: $numbers")
    println("Size: ${numbers.size}")
    println("First element: ${numbers[0]}")
    println("Second element: ${numbers[1]}")
    println("Third element: ${numbers[2]}")
    println("Forth element: ${numbers[3]}")
    println("Fifth element: ${numbers[4]}")
    println("Sixth element: ${numbers[5]}")
    println("Seventh element: ${numbers[6]}")
    println("Eighth element: ${numbers[7]}")
    println("Ninth element: ${numbers[8]}")

    println("Last index: ${numbers.size - 1}")
    println("Last element: ${numbers[numbers.size - 1 ]}")

    println("First: ${numbers.first()}")
    println("First: ${numbers.last()}")

    println("Contains 3? ${numbers.contains(3)}")
    println("Contains 8? ${numbers.contains(8)}")
    println("Contains 15? ${numbers.contains(15)}")


}