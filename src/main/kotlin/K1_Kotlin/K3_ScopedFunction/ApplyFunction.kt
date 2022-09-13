package Kotlin.K3_ScopedFunction

class Person {
    lateinit var name: String
    lateinit var number: String
    lateinit var city : String
}
fun main() {
    val person = Person().apply {
        name = "Ram"
        number = "868758"
        city = "jdjj"
    }
    println(person.name)
    println(person.number)
    println(person.city)

}


