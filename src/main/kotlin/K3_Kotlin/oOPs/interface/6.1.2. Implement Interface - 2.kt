package oOPs.`interface`

interface MyInterface2 {

    //  Property with implementation
    val prop: Int
        get() = 22
}

class InterfaceImp2 : MyInterface2 {
    //  class
}

fun main() {
    val obj = InterfaceImp2()
    println("${obj.prop}")

}