package oOPs.objectDeclarations

open class Person1(name: String, age: Int) {

    init {
        println("Name: $name, Age: $age")

    }

    fun eat() = println("Eating food.")
    fun talk() = println("Talking with people.")
    open fun pray() = println("Praying to god")

}

fun main() {
    val atheist = object : Person1("Ram", 22) {
        override fun pray() = println("I don't pray. I am a atheist")
    }

    atheist.eat()
    atheist.talk()
    atheist.pray()

}


