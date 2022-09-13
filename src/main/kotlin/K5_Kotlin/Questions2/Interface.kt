import kotlin.math.sqrt
import java.lang.Math.PI

fun main() {
    val squareCabin = SquareCabin(6, 52.50)

/*    println("\nSquare Cabin \n============")
    println("Capacity: ${squareCabin.capacity}")
    println("Material: ${squareCabin.buildingMaterial}")
    println("Has room? ${squareCabin.hasRoom()}")
 */
    with(squareCabin) {
        println("\nSquare Cabin \n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Floor Area: ${floorArea()}")
    }

    val roundHut = RoundHut(4,32.6)

    with(roundHut) {
        println("\nRound Hut \n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Floor Area: ${floorArea()}")
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Carpet Size: ${calculateMaxCarpetSize()}")
    }

    val roundTower = RoundTower(4, 2,25.20)

    with(roundTower) {
        println("\nRound Tower \n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Floor Area: ${floorArea()}")
        println("Has room? ${hasRoom()}")
        getRoom()
        println("Carpet Size: ${calculateMaxCarpetSize()}")

    }

}
abstract class Dwelling(private var residents: Int ) {
    abstract val buildingMaterial: String
    abstract val capacity: Int

    fun hasRoom(): Boolean {
        return residents < capacity
    }

    abstract fun floorArea(): Double

    fun getRoom() {
        if (capacity > residents) {
            residents++
            println("You got a room!")
        } else {
            println("Sorry, at capacity and no room available")

        }


    }


}
class SquareCabin(residents: Int, val length: Double) : Dwelling(residents) {
    override val buildingMaterial: String
        get() = "Wood"
    override val capacity: Int
        get() = 6

    override fun floorArea(): Double {
        return length * length

    }


}
open class RoundHut(residents: Int,val radius: Double ) : Dwelling(residents) {
    override val buildingMaterial: String
        get() = "Straw"
    override val capacity: Int
        get() = 4

    override fun floorArea(): Double {
        return PI* radius*radius
    }

    fun calculateMaxCarpetSize(): Double {
        val diameter = 2 * radius
        return sqrt(diameter*diameter/2)
    }

}

class RoundTower(residents: Int, val floors: Int, radius: Double):RoundHut(residents, radius) {
    override val buildingMaterial: String
        get() = "Stone"
    override val capacity: Int
        get() = 4 * floors

    override fun floorArea(): Double {
        return super.floorArea()*floors
    }

}
