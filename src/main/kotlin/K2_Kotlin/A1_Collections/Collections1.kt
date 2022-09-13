package K1_Collections

/**
 * A collection is a group of related items, like a list of words, or a set of employee records.
 * The collection can have the items ordered or unordered, and the items can be unique or not
 */

/**
 * Another type of collection in Kotlin is a set. It's a group of related items,
 * but unlike a list, there can't be any duplicates, and the order doesn't matter.
 * An item can be in the set or not, but if it's in the set, there is only one copy of it.
 */

//  List    -   Mutable List
//  Set     -   Mutable Set
//  Map     -   Mutable Map

class Lists1 {
    fun ex1() {
        val number1 = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
        val number2 = mutableListOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
        println("List: $number1")
        println("Sorted: ${number1.sorted()}")

//        number1.add()     //  Unresolved reference: add
        number2.add(12)
        number2.addAll(5, mutableListOf(25))
        println(number2)



        val setOfNumbers = number1.toSet()
        println("Set: $setOfNumbers")

    }
    fun ex2() {
        val number1 = setOf(1,2,3)
        val number2 = mutableSetOf(3, 2, 1)
        if (number1.contains(1)) println("1 is in the set")
        if (number1.contains(4)) println("4 is in the set")
        println("$number1 == $number2 : ${number1 == number2} ")
    }
    fun ex3() {
        val number1 = mapOf("One" to 1, "Two" to 2, "Three" to 3)
        val number2 = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3)
        val number3 = mutableMapOf(
            1 to "One",
            2 to "Two",
            3 to "Three"
        )
        //  Higher-Order Function
        val filterNumber = number1.filter { it.key.length <=3 }
        println("Filtered Number.")
        println(filterNumber)

        println("forEach")
        println("Key is Value")
        number3.forEach{ println("${it.key} is ${it.value}") }
        println()

        println(number1.map { "${it.key} is ${it.value} " }.joinToString(", "))
        val number4 = mutableMapOf<Int, String>()

        number3.put(4, "Four")
        number3[5] = "Five"
        number4.put(8, "Eight")
        number4.put(9, "Nine")
        number4.putAll(number3)

        println("Map1: $number1")
        println("Map2: $number2")
        println("Map3: $number3")
        println("Map4: $number4")


    }

    fun ex4() {
        val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
        val wordList = words

        val filterWords1 = wordList.filter { it.startsWith("b", ignoreCase = true) }
        val filterWords2 = wordList.filter { it.startsWith("b", ignoreCase = true) }.shuffled()
        println(filterWords1)
        println(filterWords2)
    }
}
fun main() {
    val list1 = Lists1()
    list1.ex1()
    list1.ex2()
    list1.ex3()
    list1.ex4()


}