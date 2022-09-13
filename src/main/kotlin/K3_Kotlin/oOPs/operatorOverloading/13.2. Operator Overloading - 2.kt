package oOPs.operatorOverloading



//13.2. Operator Overloading - 2

    //  Overloading + Operator

fun main() {
    val p1 = Point(3, -8)
    val p2 = Point(2, 9)

    var sum = Point()
    sum = p1 + p2
    println("sum = (${sum.x}, ${sum.y})")

}

class Point(val x: Int = 0, val y: Int = 10) {

    //  overload plus function
    operator fun plus(p: Point): oOPs.operatorOverloading.Point {
        return Point(x + p.x, y + p.y)

    }
}

