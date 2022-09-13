package oOPs.operatorOverloading

//13.3. Operator Overloading - 3

fun main() {
    var point2 = Point2(3, -8)
    --point2
    println("Point = (${point2.x}, ${point2.y})")

}

class Point2(var x: Int = 0, var y: Int = 10) {
    operator fun dec() = Point2(--x, --y)

}

