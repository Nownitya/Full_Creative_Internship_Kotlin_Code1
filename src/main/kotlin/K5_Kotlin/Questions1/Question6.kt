package questions

/**
 * Create a function that returns true when a is equal to b; otherwise return false.
 */
internal object Numbers1 {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Enter number 1: ")
        val a = readLine()!!.toInt()
        println("Enter number 2: ")
        val b = readLine()!!.toInt()

        println(compare1(a,b))

        println(compare2(a,b))

        println(compare3(a))

    }
    fun compare1(a: Int, b:Int): Boolean {

        return a == b

    }

    fun compare2(a: Int, b: Int): Boolean {

        return a.equals(b)

    }
    fun compare3(a: Int): Boolean {

        return a <= 0
    }

}