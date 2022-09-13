package Kotlin.K2_Extension_Function

class Addition(a:Int,b:Int) {
    var a = a
    var b = b

    fun add() {
        var result = a +b
        println(result)
    }
}

fun main() {
    var add = Addition(2,5)
    add.add()


}