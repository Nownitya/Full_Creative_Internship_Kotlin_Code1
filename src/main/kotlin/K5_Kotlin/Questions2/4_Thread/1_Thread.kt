package `4_Thread`

fun main() {

    val thread = Thread {
        println("${Thread.currentThread()} has run")

    }
    thread.start()
}