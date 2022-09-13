package data_Types

class Arrays{
    fun ex1(){
        val number: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        println("value at 5th Position is ${number[4]}")

        /*   byteArrayOf()
             charArrayOf()
             shortArrayOf()
             longArrayOf()
        */
    }
    fun ex2() {
        val fruit = arrayOf<String>("Apple", "Mango", "Guava", "Banana", "Orange", "Pineapple")
        println("Fruit at 0 : ${fruit[0]}")
        println("Fruit at 1 : ${fruit[1]}")
        println("Fruit at 2 : ${fruit[2]}")
        println("Fruit at 3 : ${fruit[3]}")
        println("Fruit at 4 : ${fruit[4]}")
        println("Fruit at 5 : ${fruit[5]}")
    }
    fun ex3() {
        //  Get and Set Functions
        val fruit = arrayOf<String>("Apple", "Mango", "Guava", "Banana", "Orange", "Pineapple")
        println("Get Function")
        println("Fruit at 1 : ${fruit.get(1)}")
        println("Fruit at 4 : ${fruit.get(4)}")

        println("Set Function")
        println("Fruit at 2 : ${fruit.get(2)}")
        fruit.set(2,"Pear")
        println("Fruit at 2 : ${fruit[2]}")
    }
    fun ex4() {
        //  Array Length
        val fruit = arrayOf<String>("Apple", "Mango", "Guava", "Banana", "Orange", "Pineapple")
        println("Size of Fruit Array : ${fruit.size}")
    }
    fun ex5() {
        //  Loop Through an Array
        val fruit = arrayOf<String>("Apple", "Mango", "Guava", "Banana", "Orange", "Pineapple")
        println("List of Fruits :")
        for (item in fruit) {
            println(item)

        }
    }
    fun ex6() {
        //  Check if an Element Exists
        val fruit = arrayOf<String>("Apple", "Mango", "Guava", "Banana", "Orange", "Pineapple")
        if ("Mango" in fruit) {
            println("Mango exists in fruit")

        } else {
            println("Mango doesn't exist in fruit")

        }

    }
    fun ex7() {
        //  Distinct Values from Array
        val fruit = arrayOf<String>("Apple", "Mango", "Apple", "Mango", "Orange", "Pineapple")

        val distinct = fruit.distinct()
        for (item in distinct) {
            println(item)

        }
    }
    fun ex8() {
        //  Dropping Elements from Array
        val fruit = arrayOf<String>("Apple", "Mango", "Guava", "Banana", "Orange", "Pineapple")

        val drop1 = fruit.drop(1)
        val drop2 = fruit.dropLast(4)
        for (item in drop1) {
            println(item)

        }
        for (item in drop2) {
            println(item)

        }

    }
    fun ex9() {
        //  Checking an Empty Array
        val fruit = arrayOf<String>()
        println("Array is Empty : ${fruit.isEmpty()}")

    }


}
fun main() {
    val array = Arrays()
    println("\nExample 1")
    array.ex1()
    println("\nExample 2")
    array.ex2()
    println("\nExample 3")
    array.ex3()
    println("\nExample 4")
    array.ex4()
    println("\nExample 5")
    array.ex5()
    println("\nExample 6")
    array.ex6()
    println("\nExample 7")
    array.ex7()
    println("\nExample 8")
    array.ex8()
    println("\nExample 9")
    array.ex9()





}