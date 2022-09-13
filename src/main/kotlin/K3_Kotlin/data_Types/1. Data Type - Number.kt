package data_Types

import jdk.nashorn.internal.objects.Global.print
import jdk.nashorn.internal.objects.Global.println

class Numbers{

    fun bytes() {
        val range: Byte = 108
        println("$range")
        println("Bit Width  -  8 bit")
        println("Data Range  -  -128 to 127")

    }

    fun short() {
        val temperature: Short = -31633
        println(temperature)
        println("Bit Width  -  16 bit")
        println("Data Range  -  -32768 to 32767")

    }

    fun int() {
        val score: Int = 2147483645
        println(score)
        println("Bit Width  -  32 bit")
        println("Data Range  -  -2,147,483,648 to 2,147,483,647")
    }

    fun long() {
        val score: Long = 99999
        println(score)
        println("Bit Width  -  64 bit")
        println("Data Range  -  -9,223,372,036,854,775,808 to +9,223,372,036,854,775,807")

    }

    fun double() {
        val distance: Double = 356.453131641454135+308
        println(distance)
        println("Bit Width  -  64 bit")
        println("Data Range  -  4.94065645841246544e-324 to 1.79769313486231570e+308")
    }

    fun float() {
        val weight: Float = 6255.4655.toFloat()
        println(weight)
        println("Bit Width  -  32 bit")
        println("Data Range  -  1.40129846432481707e-45 to 3.40282346638528860e+38")

    }

    fun string() {
    }

    fun random() {
        var num: Number = 18.6
        println(num)


        num = 18        // Int smart cast from Number
        print("Int      ")
        println(num)

        print("Long     ")
        num = 638L       // Long smart cast from Number
        println(num)

        print("Float    ")
        num = 65.25F     // Float smart cast from Number
        println(num)



    }


}

fun main() {

    println("----Kotlin Basic Types----")
    println("  --Number Type--")
    println("\n   -Bytes-")
    val byt = Numbers()
    byt.bytes()

    println("\n   -Short-")
    val short = Numbers()
    short.short()

    println("\n   -Int-")
    val int = Numbers()
    int.int()

    println("\n   -Long-")
    val long = Numbers()
    long.long()

    println("\n   -Double-")
    val double = Numbers()
    double.double()

    println("\n   -Float-")
    val float = Numbers()
    float.float()

    println("\n   -String-")
    val string = Numbers()
    string.string()

    println("\n   -Random-")
    val random = Numbers()
    random.random()

}
