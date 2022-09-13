package ScopeFunction

import ScopeFunction.test1.ex1
import kotlin.random.Random

data class Person1(var name: String, var age: Int, var city: String) {
    fun moveTo(newCity: String) {
        city = newCity
    }

    fun incrementAge() {
        age++
    }

}

fun writeToLong(message: String) {
    println("INFO: $message")

}
data class Person2(var name: String, var age: Int = 0, var city: String = "")

internal object test1 {
    fun ex1() {
        val str = "Hello"
        //  this
        str.run {
            println("The strings length: $length")
            // does the same
            println("The strings length: ${this.length}")
        }
        //  it
        str.let {
            println("The string's length is ${it.length}")
            //doesn't work
//        println("The string's length is ${length }}")
        }
    }
}

fun main() {
    println(ex1())


        //  let
    Person1("Raman", 20, "Banaras").let {
        println(it)
        it.moveTo("Kashi")
        it.incrementAge()
        println(it)
    }

    //  apply
    val mohan = Person2("Mohan").apply {
        this.age = 20
        city = "Banaras"

    }

    //  also
    fun getRandomInt(): Int {
        return Random.nextInt(100).also {
            writeToLong("getRandomInt() generated value $it")
        }
    }

}


