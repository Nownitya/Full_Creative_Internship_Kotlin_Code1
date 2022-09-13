package oOPs.objectDeclarations

open class Person() {
    fun eat() = println("Eat Food.")
    fun talk() = println("Talking with People.")

    open fun pray() = println("Praying God.")
}

fun main() {
    val atheist = object : Person() {
        override fun pray() = println("I don't pray. I am a atheist")

    }

    atheist.eat()
    atheist.talk()
    atheist.pray()
}