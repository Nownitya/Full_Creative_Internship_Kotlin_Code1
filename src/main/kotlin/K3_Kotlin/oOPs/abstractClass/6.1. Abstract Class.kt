package oOPs.abstractClass

import sun.security.x509.AccessDescription
import java.beans.BeanDescriptor

abstract class PersonAb(name: String) {
    init {
        println("My name is $name")
    }

    fun displaySSN(ssn: Int) {
        println("My SSN is $ssn")
    }

    abstract fun displayJob(description: String)

}
class Teacher(name: String) : PersonAb(name) {
    override fun displayJob(description: String) {
        println("$description")

    }
}

fun main() {
    val ram = Teacher("Ram Singh")
    ram.displayJob("He is a English Teacher")
    ram.displaySSN(25634)

}