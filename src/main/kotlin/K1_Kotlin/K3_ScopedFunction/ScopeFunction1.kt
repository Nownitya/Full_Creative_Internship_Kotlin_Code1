package Kotlin.K3_ScopedFunction

class Person5() {
    var name:String = "Ram"
    var age:Int = 20
    var bloodGroup: String = "O+"

    fun displayInfo() {
        println("\nName: $name \nAge: $age \nBlood Group: $bloodGroup")

    }

    fun performLetOperation() {
        val person = Person5().let {
            return@let "The name of the Person is: $name "
        }
        println(person)

    }

    /**
     * It is not necessary to write “return@let”.
     * This is only done to enhance code readability. In Kotlin,
     * if the last statement in a “let” block is a non-assignment statement,
     * it is by default a return statement.
     */
    fun performLetOperation2() {
        val person = Person5().let {
            "The name of the Person is: $name "
        }
        println(person)

    }

    fun performLetOperation3() {
        val person = Person5().let { personDetail ->
            personDetail.name = "Rohan"
        }
        println(person)
    }

    fun performLetOperation4() {
        val person = Person5().let {
            "The name of the Person is: $it "
        }
        println(person)

    }

    fun performRunOperation1() {
        Person5().run {
            name = "Raman"
            age = 22
            bloodGroup = "B"
            return@run "The detail of the person is: ${displayInfo()}"
        }
    }
    fun performRunOperation2() {
        val person = Person5().name.run {
            return@run "The name of the person is: $this"
        }
        println(person)
    }

    fun performRunOperation3() {
        val person: Person5? = null
        person?.run {
            name = "Naman"
            age = 20
            bloodGroup = "-B"
            displayInfo()
        }

    }
    fun performWithOperation1() {
        val person = with(Person5()) {
            return@with "The name of the person: ${this.name}"

        }
        println(person)
    }

    fun performWithOperation2() {
        val person: Person5? = null
        with(person) {
            this?.name = "Aman"
            this?.age = 21
            this?.bloodGroup= "AB"
            this?.displayInfo()
        }
    }

    fun performApplyOperation1() {
        val person = Person5().apply {
            name = "Amar"
            age = 20
            bloodGroup = "B-"

//            return@apply "Return a string insted of the Pesson object"  //  “apply” does not accept a return statement
        }
        println(person.name)
        println(person.displayInfo())


    }
    fun performAlsoOperation1() {
        val name = Person5().also { currentPerson ->
            println("Current name is ${currentPerson.name}\n")
            currentPerson.name = "Modified Name"
        }.run {
            "Modified name is $name"
        }
        println(name)
    }
}

fun main() {
    val user = Person5()
    user.performLetOperation()
    user.performLetOperation2()
//    user.performLetOperation3()
//    user.performLetOperation4()

    println("performRunOperation1")
    user.performRunOperation1()
    println("performRunOperation2")
    user.performRunOperation2()
    println("With")
    user.performWithOperation1()
    println("With Null")
    user.performWithOperation2()
    println("Run Null")
    user.performRunOperation3()
    println("performApplyOperation1")
    user.performApplyOperation1()
    println("performAlsoOperation1")
    user.performAlsoOperation1()

}

