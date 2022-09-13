package functions

class Structure(){
    infix fun createPyramid(rows: Int) {
        var k = 0
        for (i in 1..rows) {
            k = 0
            for (space in 1..rows - i) {
                print("  ")

            }
            while (k != 2 * i - 1) {
                print("* ")
                ++k
            }
            println()


        }
    }
}


fun main() {

    //  or & and function
    val a = true
    val b = false
    var result: Boolean

    println("Example 1")
    result = a or b     //  a.or(b)
    println("Result = $result")

    result = a and b    //  a.and(b)
    println("Result = $result")

    println()
    println("Example 2")
    val p = Structure()
    p createPyramid 4       //  p.createPyramid(4)

}