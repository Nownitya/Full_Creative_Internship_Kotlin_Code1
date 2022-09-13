open class Item1(val product: String, val price: Int)
class Noodles1 : Item("Noodle", 40) {
    override fun toString(): String {
        return product
    }


}
class Vegetable1(val topping1: String,
                val topping2: String,
                val topping3: String) : Item("Onion", 30) {
    override fun toString(): String {
        return product
    }

}

fun main() {
    val noodles = Noodles1()
    val vegetable = Vegetable1("Cabbage","Sprout","Onion")
    println(noodles.product)
    println(noodles.price)
    println(vegetable.topping1)
    println(vegetable.topping2)
    println(vegetable.topping3)


}