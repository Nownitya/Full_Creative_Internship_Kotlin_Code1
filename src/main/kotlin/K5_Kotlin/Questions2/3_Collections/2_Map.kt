package `3_Collections`

fun main() {
    val peopleAges = mutableMapOf<String, Int>(
        "Ram" to 21,
        "Amy" to 22,
        "Shohan" to 34,
        "Ramanuj" to 28,
        "Ant" to 8,
        "Rana" to 25
    )
    peopleAges.put("Rohan",23)
    peopleAges["joey"] = 25
    //  Age of Ram is updated here
    peopleAges["Ram"] = 26
    println(peopleAges)
    //  forEach
    println("forEach")
    peopleAges.forEach { print(" ${it.key} is ${it.value},") }
    //  map
    println("map")
    println(peopleAges.map { "${it.key} is ${it.value}"}.joinToString(", "))
    //  filter
    println("filter")
    val filteredNames = peopleAges.filter { it.key.length < 4 }
    println(filteredNames)
    //  Lambdas
    println("Lambdas")
    peopleAges.forEach { println("${it.key} is ${it.value}") }
    //  Function types
    println("Function types")
    val number: Int = 5
    val triple: (Int) -> Int = {a: Int -> a * 3}
    //          (function type)    (Lambda)
    println(triple(5))
    println(triple(number))

    val triple1: (Int) -> Int = { it * 4 }
    println(triple1(number))

    //  Higher-order functions
    peopleAges.filter { it.key.length > 4 }
    println(peopleAges)

    val peoplesName = listOf("Rama", "Shayam", "Hommie", "Joe")
    println(peoplesName.sorted())
    println(peoplesName.sortedWith{str1: String,str2: String -> str1.length - str2.length})


}