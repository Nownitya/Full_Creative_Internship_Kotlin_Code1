package questions

/**
 * Create a function that takes voltage and current and returns the calculated power.
 */

internal object Electricity {

    @JvmStatic
    fun main(args: Array<String>) {

        println("Enter Voltage: ")
        val v= readLine()!!.toInt()
        println("Enter Current: ")
        val i = readLine()!!.toInt()

        val power = power(v, i)
        println("Voltage = ${v}V")
        println("Current = ${i}A")
        println("Current = ${power}W")

    }

    fun power(v: Int, i: Int): Int {

        return v*i

    }
}