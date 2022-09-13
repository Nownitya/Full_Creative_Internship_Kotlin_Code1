package oOPs.inheritance

open class PersonOMF2() {
    open var age: Int = 0
        get() = field
        set(value) {
        field = value
    }
}

class BoyOMF2 : PersonOMF2() {
    override var age: Int = 0
        get() = field
        set(value) {
            field = value - 5

        }
}

fun main() {
    var boy = BoyOMF2()
    boy.age = 22
    print("Rohan fake age is ${boy.age}")

}