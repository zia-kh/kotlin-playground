package com.kotlinplayground.`object`

import com.kotlinplayground.inheritance.User

/*Kotlin does not have the support of the static keyword
companion object is used to achieve similar functionality as static members in other languages.
A companion object is an object that is declared within a class using the companion keyword.
It allows you to define members that are tied to the class itself rather than to instances of the class.
This means you can access these members without creating an instance of the class.
Here's an example to illustrate the concept of companion objects in Kotlin:
class MyClass {
    companion object {
        fun myStaticMethod() {
            println("This is a static-like method in Kotlin.")
        }
    }
}
fun main() {
    // Accessing the companion object method without creating an instance of MyClass
    MyClass.myStaticMethod()
}
* */
class Student(name: String) : User(name) {
    companion object {
        const val noOfEnrolledCourses = 5
        fun create(name: String): Student {
            return Student(name)
        }

        fun countryCode() = "USA"

    }
}

fun main() {
    val student = Student.create("Zia Khosh")
    println("Student Name: ${student.name}")
    val student2 = Student("Zia Khosh 2")
    println("Student2 Name: ${student2.name}")
    println("Country Code: ${Student.countryCode()}")
    println("noOfEnrolledCourses is : ${Student.noOfEnrolledCourses}")
}