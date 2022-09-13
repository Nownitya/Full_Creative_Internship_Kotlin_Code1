package Kotlin.K7_Coroutine


import kotlinx.coroutines.*

class User(name:String,age: Int) {

}
suspend fun firstUser():User {

    val name = "Rohan"
    val age = 34
    return User(name, age )
}
suspend fun secondUser(): User {
    val name = "Ram"
    val age = 34
    return User(name, age)
}

fun showUsers(await1: User, await2: User) {
    val a= await1
    println(a)
    val b = await2
    println(b)

}
fun main() {
    runBlocking {
        GlobalScope.launch (Dispatchers.IO) {
            val userOne = async (Dispatchers.IO){ firstUser() }
            val userTwo = async (Dispatchers.IO){ secondUser() }

            showUsers(userOne.await(),userTwo.await())  //  Back on UI Thread


        }
    }
}