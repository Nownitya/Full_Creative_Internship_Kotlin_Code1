package oOPs.companianObjects

class Person3 {

    //  name of the companion object is omitted.
    companion object {
        fun callMe() = println("I'm Called")

    }
}

fun main() {
    Person3.callMe()

}