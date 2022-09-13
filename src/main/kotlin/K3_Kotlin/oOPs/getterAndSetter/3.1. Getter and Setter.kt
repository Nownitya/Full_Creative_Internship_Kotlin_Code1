package oOPs.getterAndSetter

fun main() {
    val  p = Person()
    p.name = "Rohan"
    println("Name : ${p.name}")

}
class Person {
    var name: String = "defaultName"
        get() = field
        set(value) {
            field = value

        }
}