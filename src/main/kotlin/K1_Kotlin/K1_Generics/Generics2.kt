package Kotlin.K1_Generics

import jdk.nashorn.internal.ir.CallNode.EvalArgs

class Consumer<in T> {
    fun toString(value: T): String {
        return value.toString()
    }
}

fun main() {
    val inValue: Consumer<Number> = Consumer()
    val copyOfInValue: Consumer<Int> = inValue
    if (copyOfInValue is Consumer<Int>) {
        println(copyOfInValue.toString())
    }
}


class Consumer2<out T>(val value: T) {
    init {
        println(value)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val outValue = Consumer2("Just a String")
            val copyOfOutValue: Consumer2<Any> = outValue
            println(copyOfOutValue.value.toString())

        }
    }
}


