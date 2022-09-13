    //  mutable list
    fun main() {
        //  creating mutable list
        val entrees: MutableList<String> = mutableListOf()
        val moreItems = listOf("Rasogula","Gulabjamun","Anarsha")

        //  The integer literal does not conform to the expected type String
//        entrees.add(10)


        println("Entrees: $entrees")

        //  Add individual items using add()
        println("Add noodles: ${entrees.add("Noodles")}")
        println("Entrees: $entrees")

        println("Add spaghetti: ${entrees.add("Spaghetti")}")
        println("Entrees: $entrees")

        //  Add a list of items using addAll()
        println("Add list: ${entrees.addAll(moreItems)}")
        println("Entrees: $entrees")

        //  Remove an item from list using remove(
        println("Remove Spaghetti: ${entrees.remove("Spaghetti")}")
        println("Entrees: $entrees")

        println("Remove item that doesn't exist: ${entrees.remove("Rice")}")
        println("Entrees: $entrees")

        //  Remove an item using removeAt() with an index
        println("Remove First element: ${entrees.removeAt(0)}")
        println("Entrees: $entrees")

        //  clear out the list
        entrees.clear()
        println("Entrees: $entrees")

        //  check if the list is empty
        println("Empty? ${entrees.isEmpty()}")



    }