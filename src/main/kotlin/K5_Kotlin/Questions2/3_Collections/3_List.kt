package `3_Collections`

fun main() {
    val word = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    //  startWith()
    println("startWith()")
    val filtereWords1 = word.filter { it.startsWith("b", ignoreCase = true) }
    println(filtereWords1)
    //  shuffled()
    println("shuffled()")
    val filtereWords2 = word.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
    println(filtereWords2)
    //  take()
    println("take()")
    val filtereWords3 = word.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(2)
    println(filtereWords3)
    //  sorted()
    println("sorted()")
    val filtereWords4 = word.filter { it.startsWith("b", ignoreCase = true) }
        .shuffled()
        .take(2)
        .sorted()
    println(filtereWords4)
    val filtereWords5 = word.filter { it.startsWith("c", ignoreCase = true) }
        .shuffled()
        .take(4)
    println(filtereWords5)



}