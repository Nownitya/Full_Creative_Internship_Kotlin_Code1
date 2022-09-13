package oOPs.extensionFunction

    //  Remove first and last character of string.

fun String.removeFirstLastChar(): String = this.substring(1, this.length - 1)

fun main() {
    val myString = "Hello Everyone"
    val result = myString.removeFirstLastChar()
    println("After removing First and last Character:\n$result")
}
