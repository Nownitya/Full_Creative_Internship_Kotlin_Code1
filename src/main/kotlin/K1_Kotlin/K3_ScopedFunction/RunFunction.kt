package Kotlin.K3_ScopedFunction

import Kotlin.K1_Generics.Company

class Person3() {
    lateinit var name: String
    lateinit var number: String
    lateinit var address: String

}

fun main() {
    println("Person Name: ")
    var person: Person3? = null

    person?.run {
        println(this.name)
    }

    print("Person Name: ")

    person = Person3()?.apply {
        name = "Ram"
        number = "6798"
        address = "hskjakj"

    }

    person?.run {
        println(name)


    }





}