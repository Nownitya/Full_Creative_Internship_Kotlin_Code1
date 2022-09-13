package variable_Declaration

class Variable {
    fun ex1() {
        val language = "English"
        val mark = 85
        println(language)
        println("$mark")
    }
    fun ex2() {
        val language: String        // variable declaration of String type
        language = "Hindi"
        println(language)

        val mark: Int
        mark = 95
        println(mark)

    }
}
fun main() {
    val example = Variable()
    example.ex1()
    example.ex2()


}
