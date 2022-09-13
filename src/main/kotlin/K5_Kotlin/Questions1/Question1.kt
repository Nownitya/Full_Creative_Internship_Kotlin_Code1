package questions

/**
 * There are   number of girls and they rolled a dice in turns one after another.
 * If the number on the dice is , then the dice will be rolled again until she get a number other than.
 * Since you know the sequence of numbers which the dice shows when rolled each time, you have to find what is the total number of girls or if the sequence is invalid
 *
 * Input format
 *
 * A single line that contains a string   denoting the sequence of numbers the dice rolls on written as string.
 *
 * Output format
 *
 * If the sequence is valid print the number of girls
 * If the sequence is invalid print
 *
 * Sample Input
 * 3662123
 *
 * Sample Output
 * 5
 * Time Limit: 2
 * Memory Limit: 256
 * Source Limit:
 */

internal object Dice {
    fun findP(s:String, a: Int): Int {
        var count = 0

        for (i in 0 until s.length) {

            if (s[i].code - '0'.code != a)
                count++
        }
        return count
    }

    //  Driver
    @JvmStatic
    fun main(args: Array<String>) {
        val s = "3662123"
        val a = 6
        println(findP(s, a))

    }
}
