fun main() {
    val myFirstDice = Dice5(6)
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.numSides} sided dice rolled ${diceRoll}!")

    val mySecondDice = Dice6(20)
    println("Your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}!")

}
class Dice5(val numSides: Int) {
    fun roll(): Int {
        val randomNumber = (1..numSides).random()

        return randomNumber
    }
}