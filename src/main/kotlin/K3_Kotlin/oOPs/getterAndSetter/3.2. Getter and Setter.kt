package oOPs.getterAndSetter

fun main() {

    val ram = Boy()
    ram.actualAge = 15
    ram.age = 15
    println("Ram actual age: ${ram.actualAge}")
    println("Ram pretended age: ${ram.age}")

    val rohan = Boy()
    rohan.actualAge = 25
    rohan.age = 25
    println("Rohan actual age: ${rohan.actualAge}")
    println("Rohan pretended age: ${rohan.age}")

    val sohan = Boy()
    sohan.actualAge = 32
    sohan.age = 32
    println("Rohan actual age: ${sohan.actualAge}")
    println("Rohan pretended age: ${sohan.age}")
}
class Boy {
    var age: Int = 0
    get() = field
    set(value) {
        field = if (value < 18) {
            18
        }else if (value >= 18 && value <= 30) {
            value
        } else {
            value - 3

        }
    }
    var actualAge: Int = 0


}