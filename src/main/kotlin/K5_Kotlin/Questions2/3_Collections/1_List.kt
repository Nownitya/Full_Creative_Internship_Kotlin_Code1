package `3_Collections`

fun main() {
    val number = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    println("list: ${number}")
    println("Sorted: ${number.sorted()}")
    val setOfNumbers = number.toSet()
    println("Sets: $setOfNumbers")

    val set1 = setOf(1, 2, 3)
    val set2 = mutableSetOf(3, 2, 1)
    println("$set1 == $set2: ${set1 == set2}")

    println("Contains 7: ${setOfNumbers.contains(7)}")





}