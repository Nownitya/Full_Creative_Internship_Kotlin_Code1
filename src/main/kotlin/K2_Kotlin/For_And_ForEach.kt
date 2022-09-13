fun main() {
    val a = 6

    for (i in 0 until 10 step 3) {
        if (i == 6) continue
        println(i)
    }
    println("-----------------------------")

    (0 until 10 step 3).forEach {
        if (it == 6) return@forEach
        println(it)
    }
}