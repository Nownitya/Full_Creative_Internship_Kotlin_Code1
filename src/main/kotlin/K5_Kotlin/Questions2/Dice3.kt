fun main() {
    val myFirstDice = Dice3()
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.sides} sided dice rolled ${diceRoll}")
}

class Dice3 {
    var sides = 6

    fun roll(): Int {
        val randomNumber = (1..6).random()
        return randomNumber

    }
    

}
