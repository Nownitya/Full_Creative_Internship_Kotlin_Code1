package oOPs.visibilityModifier

private fun foo() {}       //      Visible inside Visibility_Modifier_-_Package.kt

public var bar: Int = 5     //  Property is visible Everywhere
    private set             //  Setter is visible only in Visibility_Modifier_-_Package.kt

internal val baz = 6        //  visible inside the same module

/*------------------------------------------------------------------------------------------------------*/

fun function1() {}      //  Public by default and visible everywhere
private fun function2() {}      //  Visible inside Visibility_Modifier_-_Package.kt
internal fun function() {}      //  Visible inside Same Module

var name = "Foo"    //  Visible everywhere
    get() = field   //  Visible inside Visibility_Modifier_-_Package.kt (same as its property)
private set(value) {    //  Visible inside Visibility_Modifier_-_Package.kt
    field = value
}

private class Class1 {}     //  Visible inside Visibility_Modifier_-_Package.kt
