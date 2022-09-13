open class Item(val product: String, val price: Int)
class Noodles : Item("Noodle", 40) {
    override fun toString(): String {
        return product
    }


}
class Vegetable : Item("Onion", 30) {
    override fun toString(): String {
        return product
    }

}

fun main() {
    val noodles = Noodles()
    val vegetable = Vegetable()
    println(noodles)
    println(vegetable)


}