package questions

    fun main() {
        var number: Int= 38
        var digit: Int
        var sum = 0

        while (number > 0) {
//finds the last digit of the given number
            digit = number % 10
            //adds last digit to the variable sum
            sum = sum + digit
            //removes the last digit from the number
            number = number / 10


        }
        println(number)
    }