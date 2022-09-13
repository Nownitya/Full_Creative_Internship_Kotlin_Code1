package operators

class Bitwise{
    fun shl() {
        var a: Int = 20
        var b: Int = 5
        var c: Int

        c = a.shl(3)
        println("a.shl(3) = $c")
    }
    fun shr() {
        var a: Int = 20
        var b: Int = 5
        var c: Int

        c = a.shr(3)
        println("a.shr(3) = $c")

    }
    fun ushr() {


    }
    fun and() {
        var a: Int = 20
        var b: Int = 5
        var c: Int

        c = a.and(b)
        println("a.and(b) = $c")

    }
    fun or() {
        var a: Int = 20
        var b: Int = 5
        var c: Int

        c = a.or(b)
        println("a.or(b) = $c")


    }
    fun xor() {
        var a: Int = 20
        var b: Int = 5
        var c: Int

        c = a.xor(b)
        println("a.xor(3) = $c")

    }
    fun inv() {
        var a: Int = 20
        var b: Int = 5
        var c: Int

        c = a.inv()
        println("a.inv() = $c")

    }

}
fun main(args: Array<String>) {
    var bitwise = Bitwise()
    bitwise.shl()
    bitwise.shr()
    bitwise.ushr()
    bitwise.and()
    bitwise.or()
    bitwise.xor()
    bitwise.inv()



}