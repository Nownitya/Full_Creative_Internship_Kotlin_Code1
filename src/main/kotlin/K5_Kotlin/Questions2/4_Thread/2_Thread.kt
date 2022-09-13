package `4_Thread`

fun main() {
    val states = arrayOf("Starting", "Doing Task 1", "Dooing Task 2", "Ending. . .")
    repeat(3) {
        Thread {
            println("${Thread.currentThread()} has started")
            for (i in states) {
                println("${Thread.currentThread()} - $i")
                Thread.sleep(50)
            }
        }.start()
    }
}