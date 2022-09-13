package oOPs.classAndObjects

class Lamp {
    //  property (data member)
    private var isOn: Boolean = false

    //  member function
    fun turnOn() {
        isOn = true

    }

    //  member function
    fun turnOff() {
        isOn = false

    }
    fun displayLightStatus(lamp: String) {
        if (isOn == true) {
            println("$lamp lamp is on.")

        } else {
            println("$lamp lamp is of")

        }


    }


}

fun main() {
    val l1 = Lamp()     //  create l1 object of lamp class.
    val l2 = Lamp()     //  create l2 object of lamp class.

    l1.turnOn()
    l2.turnOff()

    l1.displayLightStatus("l1")
    l2.displayLightStatus("l2")



}
