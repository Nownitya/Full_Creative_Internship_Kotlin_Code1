package K1_Collections

fun printAll(strings: Collection<String>) {
    for (s in strings) {
        print("$s ")
    }
    println()
}

fun List<String>.getShortWordTO(shortWords: MutableList<String>, maxLength: Int) {
    this.filterTo(shortWords) { it.length <= maxLength}

    // Throwing away the articles
    val articles = setOf("a", "A", "an", "An", "the", "The")
    shortWords -=articles

}
fun main() {
    val stringLis1 = listOf("One", "Two", "one", "Four")
    printAll(stringLis1)
    val stringList2 = setOf("One", "Two", "Three", "Four")
    printAll(stringList2)

    println()

    val words = "A long time ago in a galaxy far far away".split(" ")
    val shortWords = mutableListOf<String>()
    words.getShortWordTO(shortWords, 3)
    println(shortWords)

}