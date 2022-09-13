fun main() {
    val myFirstDice = Dice6(6)
    println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}!")

    val mySecondDice = Dice6(20)
    println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")

}
class Dice6(val numSides: Int) {
    fun roll(): Int {

        return (1..numSides).random()
    }
}