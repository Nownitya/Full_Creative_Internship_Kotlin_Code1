package oOPs.inheritance

open class PersonOMF1 {
    open fun displayAge(age: Int) {
        println("My age is $age")

    }
}
class BoyOMF1 : PersonOMF1() {
    override fun displayAge(age: Int) {
        println("My fake age is ${age - 5}.")

    }
}

fun main() {
    val boy = BoyOMF1()
    boy.displayAge(22)



}