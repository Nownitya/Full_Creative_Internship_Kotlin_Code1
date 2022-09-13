open class Item2(val product: String, val price: Int)
class Noodles2 : Item("Noodle", 40) {
    override fun toString(): String {
        return product
    }


}
class Vegetable2(val toppings: List<String>) : Item2("Vegetable:", 30) {
    override fun toString(): String {
        return product+toppings
    }

}

fun main() {
    val noodles = Noodles2()
    val vegetable = Vegetable2(listOf("Cabbage","Sprout","Onion"))
    println(noodles)
    println(vegetable)



}