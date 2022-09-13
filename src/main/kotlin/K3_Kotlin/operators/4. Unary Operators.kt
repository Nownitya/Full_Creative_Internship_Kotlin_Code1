package operators

class Unary{
    fun plus() {
        var a = 5
        println("+a = ${+a}")

    }
    fun minus() {
        var a = 5
        println("-a = ${-a}")

    }
    fun not() {
        var b: Boolean = true
        println("!b = ${!b}")

    }
    fun inc() {
        var a = 5
        println("++a = ${++a}")


    }
    fun dec() {
        var a = 5
        println("--a = ${--a}")

    }

}
fun main() {
    var unary = Unary()
    unary.plus()
    unary.minus()
    unary.not()
    unary.inc()
    unary.dec()


}