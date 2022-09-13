package expressionAndStatement

class Expression {
    fun ex1() {
        val a = 90
        val b = 62
        val max: Int

        max = if (a > b) a else b     //  Expression
        println(max)

    }
    fun ex2() {
      val temperature = 20
      val msg = "The water temperature ${ if (temperature > 50) "Too warm" else "ok"}"
        println(msg)
    }
}

class Statement {
    fun ex1() {
        val score = 230     //  Statement
        println(score)

    }

    fun ex2() {
        val temperature = 20
        println(temperature)
    }

}

fun main() {
    val exp = Expression()
    exp.ex1()
    exp.ex2()

    val sta = Statement()
    sta.ex1()
    sta.ex2()

}
