package operators

class IndexAccessOperator{
    fun ex1() {
        var num = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
        println(num[2])
        num[2] = 8
        println(num[2])
    }
}
fun main(args: Array<String>) {
    var iao = IndexAccessOperator()
    iao.ex1()
}