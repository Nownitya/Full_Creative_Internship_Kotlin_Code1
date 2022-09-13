    //  List are read-only

fun main() {
    val colors = listOf("red", "green", "blue")
    //  It is not possible to change read-only list
//    colors.add("violet")
//    colors[0] = "yellow"

    //  Reversed list
    println("Reversed list: ${colors.reversed()}")
    //  list
    println("list: ${colors}")
    //  SOrting of a list
    println("Sorted list: ${colors.sorted()}")



}