package oOPs.inheritance

open class PersonIn2(name: String, age: Int){


}
class Footballer2(name: String, age: Int, club: String) : PersonIn2(name, age) {
init {
    println("Football player $name of age $age and plays for $club")

}
    fun playFootball() {
        println("I am playing Football")

    }
}

fun main() {
    val fu1 = Footballer2("Sunil Chhetri", 35, "India")



}