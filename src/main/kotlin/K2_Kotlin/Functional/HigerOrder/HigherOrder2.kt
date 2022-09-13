package Functional.HigerOrder

fun operation(): (Int) -> Int {
    return ::square

}

fun square(a: Int): Int {
    return a*a
}

fun main() {
    val result = operation()
    println(result(2))
}