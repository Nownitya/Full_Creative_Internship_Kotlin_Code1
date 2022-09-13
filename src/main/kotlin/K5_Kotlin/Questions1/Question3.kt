package questions

/**
 * Given two numbers, return true if the sum of both numbers is less than 100. Otherwise return false.
 */

internal object Find {
    fun add(a: Int, b: Int): Boolean {

        val c = (a + b)
        println(c)

        //  Boolean
        return c <= 100
    }

    @JvmStatic
    fun main(args: Array<String>) {

        println("Enter no. 1")
        val a: Int = readLine()!!.toInt()

        println("Enter n0. 2")
        val b: Int = readLine()!!.toInt()

        println(add(a, b))

}


}