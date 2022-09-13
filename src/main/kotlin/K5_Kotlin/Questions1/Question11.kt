package questions

class Person {

    companion object {
        var name = "Ram"
        var age = 20

        fun name(): String {
            println(name)
            return "Mohan".also { name = it }
        }

        fun age():Int {
            println(age)
            return 21.also { age = it }

        }
    }
}

fun main() {
    println(Person.name())
    println(Person.age())
}


