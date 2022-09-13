open class Item3(val product: String, val price: Int)
class Order3(val orderNumber: Int) {
    private val itemList = mutableListOf<Item3>()

    fun addItem(newItem: Item3) {
        itemList.add(newItem)
    }

    fun addAll(newItems: List<Item3>) {
        itemList.addAll(newItems)
    }

    fun print() {
        println("Order #${orderNumber}")
        var total = 0
        for (item in itemList) {
            println("${item}: ₹${item.price}")
            total += item.price

        }
        println("Total: ₹${total}")

    }
}


class Noodles3 : Item3("Noodles", 30) {
    override fun toString(): String {
        return product
    }

}

class Vegetable3(vararg val toppings: String) : Item3("Vegetable:", 30) {
    override fun toString(): String {
        if (toppings.isEmpty()) {
            return "$product chef's choice"
        } else {
            return product + " " + toppings.joinToString()
        }

    }

}


fun main() {
//    val noodles = Noodles3()
//    val vegetable = Vegetable3("Cabbage","Sprout","Onion")
//    val vegetable2 = Vegetable3()
//    println(noodles)
//    println(vegetable)
//    println(vegetable2)


    val order1 = Order3(1)
    order1.addItem(Noodles3())
    order1.print()

    println()

    val order2 = Order3(2)
    order2.addItem(Noodles3())
    order2.addItem(Vegetable3())
    order2.print()

    println()

    val order3 = Order3(3)
    val items = listOf(Noodles3(), Vegetable3("carrots", "Beans", "Celery"))
    order3.addAll(items)
    order3.print()


}