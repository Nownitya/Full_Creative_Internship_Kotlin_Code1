package Kotlin.K3_ScopedFunction

class Person2 {
    lateinit var name: String
    lateinit var number: String
    lateinit var city : String
}
fun main() {
    val person = Person2().apply {
        name = "Ram"
        number = "868758"
        city = "jdjj"
    }
    with(person) {
        println(name)
        println(number)
        println(this.city)
    }

}