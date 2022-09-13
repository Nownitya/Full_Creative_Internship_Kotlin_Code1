import jdk.nashorn.internal.objects.Global.print
import jdk.nashorn.internal.objects.Global.println

fun main() {
    val border = "`-._.-`"
    val timesToRepeat = 4
    printBorder(border, timesToRepeat)
    println(" Happy Birthday Rover ")
    printBorder(border, timesToRepeat)

    
}
fun printBorder (border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()

}
