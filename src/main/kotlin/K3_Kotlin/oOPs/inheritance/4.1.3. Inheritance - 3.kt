package oOPs.inheritance

fun main() {
    val p1 = AuthLog2("Bad Password")

}
open class Log2 {
    var data: String = ""
    var numberOfData: Int = 0

    constructor(_data: String){

    }
    constructor(_data: String, _numberOfData: Int) {
        data = _data
        numberOfData = _numberOfData
        println("$data: $numberOfData times")

    }
}

class AuthLog2 : Log2 {
    constructor(_data: String) : this("From AuthLog -> $_data", 10) {


    }
    constructor(_data: String, _numberOfData: Int) : super(_data, _numberOfData) {

    }


}