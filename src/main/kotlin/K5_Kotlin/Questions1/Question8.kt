package questions

/**
 * Create a function that takes length and width and finds the perimeter of a rectangle.
 */

internal object Rectangle {
    @JvmStatic
    fun main(args: Array<String>) {
        println("Enter length of Rectangle")
        val l = readLine()!!.toInt()
        println("Enter breath of Rectangle")
        val w = readLine()!!.toInt()

        println("Perimeter: "+perimeter(l, w))

        println("Area: "+area(l, w))


    }

    fun perimeter(l: Int, w: Int): Int {

        return 2 * l + 2 * w

    }

    fun area(l: Int, w: Int): Int {
        return l * w

    }

}

internal object Triangle {

    @JvmStatic
    fun main(args: Array<String>) {
        println("Enter side 1")
        val s1 = readLine()!!.toInt()
        println("Enter side 2")
        val s2 = readLine()!!.toInt()

        println("Maximum range of a triangle's third edge")
        var res = mEdge(s1, s2)
        if (s1 < res && s2 < res) {
            println(res)
        }
        else
            error("Error")


        println("Enter side Height")
        val h = readLine()!!.toInt()
        println("Enter side Base")
        val b = readLine()!!.toInt()

        println("Area of Triangle")

        val areaT = area(h, b)
        println(areaT)



    }

    /**
     * Create a function that finds the maximum range of a triangle's third edge, where the side lengths are all integers.
     */

    fun mEdge(s1: Int, s2: Int): Int {

        return (s1+ s2)-1

    }

    /**
     * Write a function that takes the base and height of a triangle and return its area.
     */
    fun area(h: Int, b: Int): Float {

        return (b * h) / 2F

    }

}