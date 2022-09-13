package operators

class In{

    fun ex1() {
        val num = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
        if (5 in num) {
            println("Array contain 5")

        } else {
            println("Array doesn't contain 5")
        }
    }
}
fun main(args: Array<String>) {
    val in_operator = In()
    in_operator.ex1()
}