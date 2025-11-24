package com.kotlinplayground.inheritance

/*Inheritance - Extending Classes
1. Inheritance Basics
   - In Kotlin, classes are final by default. To allow a class to be inherited, you must mark it with the open keyword.
   - Example:
     ```kotlin
     open class Animal {
         open fun sound() {
             println("Animal makes a sound")
         }
     }

     class Dog : Animal() {
         override fun sound() {
             println("Dog barks")
         }
     }
     ```
     Any is the superclass of all classes in Kotlin.
     All the classes in Kotlin are by default final (not open for inheritance).
     Extending a class is done using the colon (:) symbol followed by the superclass name and parentheses.
* */

open class User(val name: String) {

    open var isLoggedIn: Boolean = false

    // inheritane - overriding functions
    // Mark the function with open keyword in the base class to allow overriding
    open fun login() {
        println("$name logged in")
    }

}

class Student(name: String) : User(name) {
    override var isLoggedIn: Boolean = true

    // overriding the login function
    override fun login() {
        println("Student $name logged in")
    }
}

class Instructor(name: String) : User(name) {
    // overriding the login function
    override fun login() {
        println("Instructor $name logged in")
    }
}

fun main() {
    val student = Student("Alice")
    student.login()
    val instructor = Instructor("Bob")
    instructor.login()

    println("Student Name: ${student.name}")
    println("Instructor Name: ${instructor.name}")
}