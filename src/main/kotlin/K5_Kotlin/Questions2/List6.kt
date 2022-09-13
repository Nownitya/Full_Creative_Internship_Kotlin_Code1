//  Loop

fun main() {
    val names = listOf("Ram", "Shyam", "Rabhya", "Mohan", "Sohan")

    //  Iterate over items in a list
    for (name in names) {
//        println(name)
        println("$name - Number of characters: ${name.length}")

    }
    println()

    //  Range of characters in an alphabet
    for (item in 'a'..'z') {
        println(item)
    }
    println()

    //  Range of number
    for (item in 1..9) {
        println(item)
    }
    println()

    //  Going back
    for (item in 5 downTo 1) {
        println(item )

    }
    println()

    //  Stepping
    for (item in 3..11 step 2) {
        println(item)
    }


}