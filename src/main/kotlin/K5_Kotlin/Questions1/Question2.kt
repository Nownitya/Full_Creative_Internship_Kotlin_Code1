package questions

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.io.PrintWriter


object TestClass {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val br = BufferedReader(InputStreamReader(System.`in`))
        val wr = PrintWriter(System.out)
        val N = br.readLine().trim { it <= ' ' }.toInt()
        val A = arrayOfNulls<String>(N)
        for (i_A in 0 until N) {
            A[i_A] = br.readLine()
        }
        val out_ = findMessages(N, A)
        println(out_)
        wr.close()
        br.close()
    }

    fun findMessages(N: Int, A: Array<String?>?): Int {
        // Write your code here
        return 0
    }
}