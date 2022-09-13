package oOPs.visibilityModifier

open class Base {
    var a = 1   //  public by Default
    private var b = 2     //    private to base class
    protected open val c = 3    //  visible to the base class and the derived class
    internal val d = 4      //  visible inside the same module

    protected fun e() {}    //  visible to the base and the derived class

}
class Derived : Base() {
    // a,c,d and e() of the base class are visible
    // b is not visible

    override val c = 9  // c is protected

}

fun main() {
    val base = Base()

    // base.a and base.b are visible
    // base.b, base.c and base.e() are not visible

    val derived = Derived()
    // derived c is not visible
}
