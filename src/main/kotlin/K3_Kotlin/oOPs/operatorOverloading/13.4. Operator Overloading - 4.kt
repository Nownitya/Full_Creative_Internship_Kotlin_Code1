package oOPs.operatorOverloading

fun main() {
    val p1 = Point3(3, -8)
    val p2 = Point3(2, 9)

    var sum = Point3()
    sum = p1 + p2


}

class Point3(val x: Int = 0, val y: Int = 10) {
    //overloading plus function
    operator fun plus(p: Point3) = Point3(x - p.x, y - p.y)

}


