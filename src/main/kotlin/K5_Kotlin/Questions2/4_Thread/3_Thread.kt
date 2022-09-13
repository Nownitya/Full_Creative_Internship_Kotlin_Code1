package `4_Thread`

fun main() {
    var count = 0
    for (i in 1..50) {
        Thread {
            count += 1
            println("Thread $i count: $count")
        }.start()
    }
}

//fun main() {
//    var count = 0
//    for (i in 1..50) {
//        Thread {
//            count += 1
//            println("Thread: $i count: $count")
//        }.start()
//    }
//}