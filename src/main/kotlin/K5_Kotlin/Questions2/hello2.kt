fun main() {
    val border = "%"
    printBorder(border)
    println(" Happy Birthday Rover ")
    printBorder(border)
}

fun printBorder(border: String) {
    // println("=======================")
    repeat(23) {
        print(border)
    }
    println()
}

// fun printBorder() {
//     // println("=======================")
//     repeat(23) {
//         print("=")
//     }
//     println()
// }

