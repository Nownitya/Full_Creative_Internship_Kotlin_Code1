//  Loop Through List

fun main() {
    val guestPerFamily = listOf(2, 4, 1, 3)
    var totalGuest = 0
    var index = 0

    while (index < guestPerFamily.size) {
        totalGuest += guestPerFamily[index]
        index++


    }
    println("Total guest count: ${totalGuest}")
    println()
}