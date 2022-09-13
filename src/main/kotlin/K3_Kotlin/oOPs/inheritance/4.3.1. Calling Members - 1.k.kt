package oOPs.inheritance

/*   call functions (and access properties) of the base class from a derived class using super keyword.   */

open class PersonMF1() {
    open fun displayAges(age: Int) {
        println("Actual age is $age")

    }
}
class BoyMF: PersonMF1() {
    override fun displayAges(age: Int) {
        //  Calling functiion of base class
        super.displayAges(age)

        println("Fake age is ${age - 5}.")

    }

}

fun main() {
    val boy = BoyMF()
    boy.displayAges(25)

}

