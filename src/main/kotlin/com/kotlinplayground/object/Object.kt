package com.kotlinplayground.`object`

/*object keyword
* This keyword allows us to create a class and an instance of the class at the same time
* It is used to create singleton classes, which means only one instance of the class can exist
* It can also be used to create companion objects, which are objects that are tied to a class
* and can access its private members
* Example of singleton object*
* */
object AuthenticatedUser {
    fun authenticate(userName: String, password: String) {
        println("User $userName authenticated successfully.")
    }
}
fun main() {
    // Accessing the singleton object and its method
    AuthenticatedUser.authenticate("zia", "password123")
}
