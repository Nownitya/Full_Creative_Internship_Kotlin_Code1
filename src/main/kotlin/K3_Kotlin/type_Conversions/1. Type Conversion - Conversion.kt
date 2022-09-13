package type_Conversions

class Conversion{
    fun ex1() {
        val a: Int = 100
        val b: Long = a.toLong()
        println(b)

    }
    fun ex2() {
        val a: Int = 5624966
        val b: Byte = a.toByte()

        println("Num 1 = $a")
        println("Num 2 = $b")
    }
}
fun main(args: Array<String>) {
    var con = Conversion()
    con.ex1()
    con.ex2()

    println(".toByte()\n" + ".toShort()\n" + ".toInt()\n" + ".toLong()\n"
            + ".toFloat()\n" + ".toDouble()\n" + ".toChar()")
}