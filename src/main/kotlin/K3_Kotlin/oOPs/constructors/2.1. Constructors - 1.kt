package oOPs.constructors

fun main() {

    //Primary Constructor
    println("Example 1")

    val person1 = Person1("Ram", 22)

    println("First name = ${person1.firstName}")
    println("Age = ${person1.age}")

    //  Primary Constructor and Initializer Blocks
    println("\nExample 2")
    val person2 = Person2("Ram", 22)

    println("\nExample 3")
    val person3 = Person3("Ram", 22)

    println("\nExample 4")
    println("Person41 is instantiated")
    val person41 = Person4("Ram", 22)

    println("Person42 is instantiated")
    val person42 = Person4("Rohan")

    println("Person43 is instantiated")
    val person43 = Person4()


}

class Person1(val firstName: String, var age: Int)

class Person2(fName: String, personAge: Int) {
    val firstName: String
    val age: Int

    // Initializer block
    init {
        firstName = fName.capitalize()
        age = personAge

        println("First Name = $firstName")
        println("Age = $age")

    }
}

class Person3(fName: String, personAge: Int) {
    val firstName = fName.capitalize()
    var age = personAge

    //  Initializer block
    init {
        println("First name = $firstName")
        println("Age = $age")
    }
}

class Person4(_firstName: String = "UNKNOWN", _age: Int = 0) {

    val firstName = _firstName.capitalize()
    val age = _age

    //  initialize block
    init {
        println("First Name = $firstName")
        println("Age = $age")
    }
}




