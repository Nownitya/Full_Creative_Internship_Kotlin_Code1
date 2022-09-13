package questions

internal class Fibonacci1 {
    var t1 = "a"
    var t2 = "b"
    var t3 = "ba"
    var n = 0

    fun user1() {
        println("Enter First Alphabet")
        t1 = readLine()!!.toString()
        println("Enter Second Alphabet")
        t2 = readLine()!!.toString()
        t3 = "$t2$t1"
        println("Enter Term")
        n = readLine()!!.toInt()

    }
    fun function1() {

        if (n < 2) {
            println("Error")
        } else if (n == 2) {
            print("$t1 $t2 ")
        } else {

            print("$t1 $t2 ")
            for (i in 1..n - 2) {
                t3 = t2 + t1
                print("$t3 ")
                t1 = t2
                t2 = t3
            }
        }

    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val fb = Fibonacci1()
            fb.user1()
            fb.function1()



        }
    }

}


internal object Fibonacci2 {


    @JvmStatic
    fun main(args: Array<String>) {

        var t1 = "a"
        var t2 = "b"
        var t3 = "$t2$t1"
        var n = 5


        if (n < 2) {
            println("Error")
        } else if (n == 2) {
            print("$t1 $t2 ")
        } else {

            print("$t1 $t2 ")
            for (i in 1..n - 2) {
                t3 = t2 + t1
                print("$t3 ")
                t1 = t2
                t2 = t3
            }
        }

    }

}

internal class FiboString3 {
    var x = "a"
    var y = "b"
    var z = "$y$x"
    var n = 0

    fun accept() {
        println("Enter a")
        x = readLine()!!.toString()
        println("Enter b")
        y = readLine()!!.toString()
        println("Enter Term")
        n = readLine()!!.toInt()
    }

    fun generate() {
        if (n == 1) {
            print(x)
        } else if (n == 2) {
            print("$x $y")
        } else {
            print("$x $y ")
            for (i in 1..n - 2) {
                z = y + x
                print("$z ")
                x = y
                y = z
            }
        }
        println()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val fs = FiboString3()
            fs.accept()
            fs.generate()
        }
    }
}