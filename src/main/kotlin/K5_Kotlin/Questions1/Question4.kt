package questions

/**
 * Write a function that takes an integer minutes and converts it to seconds.
 *
 * Don't forget to return the result.
 */

internal object ConvertorMin {

    @JvmStatic
    fun main(args: Array<String>) {

        println("Enter Minute")
        val m = readLine()!!.toInt()
        val s = minTOsec(m)

        println("$m min = $s sec")

    }
    fun minTOsec(min: Int): Int {

        return min * 60

    }

}

/**
 * Write a function that converts hours into seconds.
 */

internal object ConvertHr {

    @JvmStatic
    fun main(args: Array<String>) {
        println("Enter Hour: ")
        val h = readLine()!!.toInt()
        val s = hrTOsec(h)

        println("$h hr = $s sec")

    }

    fun hrTOsec(s: Int): Int {
        return s * 3600

    }
}