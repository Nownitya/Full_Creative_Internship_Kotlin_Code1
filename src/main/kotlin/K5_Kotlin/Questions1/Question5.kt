package questions

/**
 * Create a function that takes a number as an argument,
 * increments the number by +1 and returns the result.
 */
internal object Func {

    @JvmStatic
    fun main(args: Array<String>) {
        println("Enter a number: ")
        val num: Int = readLine()!!.toInt()
        val result = increment(num)

        println("$num + 1 = $result")

    }

    fun increment(result: Int): Int {

        return result +1

    }
}