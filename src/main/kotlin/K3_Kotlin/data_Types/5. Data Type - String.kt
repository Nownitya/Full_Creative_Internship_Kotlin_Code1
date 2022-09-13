package data_Types

class Strings{
    fun escaped_String() {
        val escapedString: String = "This is Escaped String. \n"
        println(escapedString)

    }
    fun raw_String() {
        val rawString: String = """This is going to be
            |multi-line string (raw string) and will not have 
            |any escape sequences.""".trimMargin()
        println(rawString)
    }
    fun concatenation() {
        //  String concatenation
        val start = "Talk is cheap"
        val middle = "Show me the code"
        val end = "Start now."
        val first_name = "Rohan"
        val last_name = "Singh"
        val result = start + middle + end
        print(result)
        println("Full Name : $first_name$last_name")
        println("Full Name : " + first_name + last_name)
        println("Full Name : "+first_name.plus(last_name))

    }
    fun ex1() {
        //  String Indexes
        val name: String = "Rohan Singh"
        println(name[4])
        println(name[7])

    }
    fun ex2() {
        //  String Length
        val name: String = "Rohan Singh"

        println("The Length of name : ${name.length}")
        println("The Length of name : ${name.count()}")
    }
    fun ex3() {
        //  String Last Index
        val name: String = "Rohan Singh"
        println("The index of last character in Name : ${name.lastIndex}")

    }
    fun ex4() {
        //  Changing Case of Strings
        var name: String = "Rohan Singh"

        println("Upper case : ${name.toUpperCase()}")
        println("Upper case : ${name.toLowerCase()}")

    }
    fun ex5() {
        //  Trim Characters from a String
        var name: String = "Rohan Singh"

        println("Remove First two Character : ${name.drop(2)}")
        println("Remove last two Character : ${name.dropLast(2)}")

    }
    fun ex6() {
        //  Quotes Inside a String
        var str1 : String = "That's it"
        var str2 : String = "It's OK"

        println("str1 : " + str1)
        println("str2 : " + str2)
    }
    fun ex7() {
        //  Finding a String inside a String
        val string: String = "This is Kotlin programing lists to get help"

        println("Index of \"Kotlin\" : ${string.indexOf("Kotlin")}")

    }
    fun ex8() {
        //  Comparing Two Strings
        var str1: String = "Rohan"
        var str2: String = "Rohan"
        var str3: String = "Singh"

        println("Compare String 1 & 2 : ${str1.compareTo(str2)}")
        println("Compare String 2 & 3 : ${str2.compareTo(str3)}")

    }
    fun ex9() {
        //  getOrNull() function
        val name: String = "Rohan Singh"

        println("Character at 2 : ${name.getOrNull(2)}")
        println("Character at 8 : ${name.getOrNull(8)}")
        println("Character at 15 : ${name.getOrNull(15)}")

    }
    fun ex10() {
        //  toString() function
        var name : String = "Rohan Singh"

        println(name.toString())

    }



}

fun main() {
    var string = Strings()
    println("----Stings----")
    println("--Escaped String--")
    string.escaped_String()
    println("--Raw String--")
    string.raw_String()
    string.concatenation()

    println("Example 1")
    string.ex1()
    println("Example 2")
    string.ex2()
    println("Example 3")
    string.ex3()
    println("Example 4")
    string.ex4()
    println("Example 5")
    string.ex5()
    println("Example 6")
    string.ex6()
    println("Example 7")
    string.ex7()
    println("Example 8")
    string.ex8()
    println("Example 9")
    string.ex9()
    println("Example 10")
    string.ex10()



}