package `4_Thread`
//
//
//import kotlinx.coroutines.*
//import javax.xml.bind.JAXBElement.GlobalScope
//
//
//fun main() {
//    val states = arrayOf("Starting", "Doing Task 1", "Doing Task 2", "Ending...")
//    repeat(3) {
////        GlobalScope.launch{
////            println("${Thread.currentThread()} has started.")
////            for (i in states) {
////                println("${Thread.currentThread()} - $i")
////                delay(5000)
////            }
////        }
//    }
//}
//
///**
// *  ---------------------------------------------------------------OUTPUT---------------------------------------------------------------
// * Thread[DefaultDispatcher-worker-1 @coroutine#1,5,main] has started. Thread[DefaultDispatcher-worker-1 @coroutine#1,5,main] - Starting
// * Thread[DefaultDispatcher-worker-2 @coroutine#2,5,main] has started. Thread[DefaultDispatcher-worker-2 @coroutine#2,5,main] - Starting
// * Thread[DefaultDispatcher-worker-1 @coroutine#3,5,main] has started. Thread[DefaultDispatcher-worker-1 @coroutine#3,5,main] - Starting
// */
//
//
//
////fun main() {
////    repeat(3) {
//////        GlobalScope.launch {
//////            println("Hi from ${Thread.currentThread()}")
//////        }
////    }
////}
//
//
///**
// *  ----------------------------OUTPUT----------------------------
// *  Hi from Thread[DefaultDispatcher-worker-1 @coroutine#1,5,main]
// *  Hi from Thread[DefaultDispatcher-worker-2 @coroutine#2,5,main]
// *  Hi from Thread[DefaultDispatcher-worker-2 @coroutine#3,5,main]
// */