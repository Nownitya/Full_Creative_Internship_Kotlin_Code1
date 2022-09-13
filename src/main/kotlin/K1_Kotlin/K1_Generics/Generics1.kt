package Kotlin.K1_Generics

class Company<T>(text: T) {
    var a = text
    init {
        println(a)
    }
}

fun main() {
    var name: Company<String> = Company("Full Creative")
    var emp_no: Company<Int> = Company(5463)
    println(name)
    println(emp_no)
}