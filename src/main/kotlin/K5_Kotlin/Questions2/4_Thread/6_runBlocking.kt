package `4_Thread`

//import java.time.LocalDateTime
//import java.time.format.DateTimeFormatter
//
//val formatter = DateTimeFormatter.ISO_LOCAL_TIME
//val time = { formatter.format(LocalDateTime.now())}
//
//suspend fun getValue(): Double {
//    println("Entering getValue() at ${time()}")
//    delay(3000)
//    println("Leaving getValue at ${time()}")
//    return Math.random()
//
//}
//
//Fun CoroutineScope.async() {
//    context: CoroutineContext = EmptyCoroutineContext,
//    start: CoroutineStart = CoroutineStart.DEFAULT,
//    block: suspend CoroutineScope.() -> T
//}: Deferred<T>
//
//
//fun main() {
//    runBlocking {
////        val num1 = getValue()
////        val num2 = getValue()
////        println("Result of num1 + num2 is ${num1 + num2}")
//        val num1 = async { getValue() }
//        val num2 = async { getValue() }
//        println("result of num1 + num2 is ${num1.await() + num2.await()}")
//
//    }
//}