package operators

class Logical{


    fun logicalAnd() {
        val a = 10
        val b = 8
        val c = 2

        val result: Boolean = (a > b) && (a > c)
        println("$result")
    }

    fun logicalOr() {
        val a = 10
        val b = 8
        val c = 2
        val result: Boolean = (a > b) || (a < c)
        println(result)

    }

    fun logicalNot() {
        val a = true
        val result: Boolean = !a
        println(result)

    }
}
fun main() {
    val logical = Logical()
    logical.logicalAnd()
    logical.logicalOr()
    logical.logicalNot()


}