package Kotlin.K7_Coroutine

fun main() {
    functionA(1)
}
fun functionA(case: Int) {
    when (case) {
        1 -> {
            taskA1()
            functionB(1)
        }
        2 -> {
            taskA2()
            functionB(2)
        }
        3 -> {
            taskA3()
            functionB(3)

        }
        4 -> {
            taskA4()
            functionB(4)
        }

    }


}

fun taskA1() {
    println("This is Task A1")
}
fun taskA2() {
    println("This is Task A2")
}
fun taskA3() {
    println("This is Task A3")
}
fun taskA4() {
    println("This is Task A2")
}

fun functionB(case: Int) {
    when (case) {
        1 -> {
            taskB1()
            functionA(1)
        }
        2 -> {
            taskB2()
            functionA(2)
        }
        3 -> {
            taskB3()
            functionA(3)

        }
        4 -> {
            taskB4()
            functionA(4)

        }
    }

}

fun taskB1() {
    println("This is Task B1")
}
fun taskB2() {
    println("This is Task B2")
}
fun taskB3() {
    println("This is Task B3")
}
fun taskB4() {
    println("This is Task B2")
}