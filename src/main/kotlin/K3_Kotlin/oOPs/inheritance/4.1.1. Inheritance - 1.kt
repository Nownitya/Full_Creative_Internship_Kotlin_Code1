package oOPs.inheritance

open class PersonIn1(name: String, age: Int) {
    init {
        println("My name is $name")
        println("My age is $age")

    }
}
class MathTeacher(name: String, age: Int) : PersonIn1(name, age) {
    fun techMath() {
        println("I teach in school")

    }
}
class Footballer1(name: String, age: Int) : PersonIn1(name, age) {
    fun playFootball() {
        println("I paly football for a club")

    }
}

fun main() {
    val t1 = MathTeacher("Rohan", 22)
    t1.techMath()

    val f1 = Footballer1("Ram", 21)
    f1.playFootball()

}