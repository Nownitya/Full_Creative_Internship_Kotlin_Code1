open class Item4(val product: String, val price: Int)
class Noodles4 : Item4("Noodles", 30) {
    override fun toString(): String {
        return product
    }

}

class Vegetable4(vararg val toppings: String) : Item4("Vegetable:", 30) {
    override fun toString(): String {
        if (toppings.isEmpty()) {
            return "$product chef's choice"
        } else {
            return product + " " + toppings.joinToString()
        }

    }

}

class Order4(val orderNumber: Int) {
    private val itemList = mutableListOf<Item4>()

    fun addItem(newItem: Item4): Order4 {
        itemList.add(newItem)
        return this
    }

    fun addAll(newItems: List<Item4>):Order4 {
        itemList.addAll(newItems)
        return this

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


fun main() {
//    val noodles = Noodles3()
//    val vegetable = Vegetable3("Cabbage","Sprout","Onion")
//    val vegetable2 = Vegetable3()
//    println(noodles)
//    println(vegetable)
//    println(vegetable2)

    val orderList= mutableListOf<Order4>()


    // Add an item to an order
    val order1 = Order4(1)
    order1.addItem(Noodles4())
    orderList.add(order1)

    // Add multiple items individually
    val order2 = Order4(2)
    order2.addItem(Noodles4())
    order2.addItem(Vegetable4())
    orderList.add(order2)

    // Add a list of items at one time
    val order3 = Order4(3)
    val items = listOf(Noodles4(), Vegetable4("carrots", "Beans", "Celery"))
    order3.addAll(items)
    orderList.add(order3)

    // Use builder pattern
    val order4 = Order4(4)
        .addItem(Noodles4())
        .addItem(Vegetable4("Cabbage","Onion"))
    orderList.add(order4)

    // Create and add order directly
    orderList.add(
        Order4(5)
            .addItem(Noodles4())
            .addItem(Noodles4())
            .addItem(Vegetable4("Spinach"))
    )
    // Print out each order
    for (order in orderList) {
        order.print()
        println()
    }


}