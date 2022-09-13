package oOPs.classAndObjects

class Lamp2 {
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

    fun displayLightStatus() {
        if (isOn == true) {
            println("Lamp is On")

        } else {
            println("Lamp is Off")
        }
    }


}

fun main() {

    val lamp = Lamp2()
    lamp.displayLightStatus()

}