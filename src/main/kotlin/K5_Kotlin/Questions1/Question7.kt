package questions

/**
 * Given an object containing counts of both upvotes and downvotes, return what vote count should be displayed.
 * This is calculated by subtracting the number of downvotes from upvotes.
 */

internal object Vote {

    @JvmStatic
    fun main(arg: Array<String>) {
        println("Enter Upvote")
        val up = readLine()!!.toInt()
        val down = readLine()!!.toInt()

        println("VOTE ${result(up,down)}")
    }

    fun result(up: Int, down: Int): Int {
        return up - down

    }
}