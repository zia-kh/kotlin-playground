package com.kotlinplayground.basics

import com.kotlinplayground.functions.courseName
import com.kotlinplayground.functions.topLevelFunction

fun main() {
    // Immutable variable (read-only)
    val immutableVariable  = "I cannot be changed"
    println(immutableVariable)

    // Mutable variable
    var mutableVariable  = "I can be changed"
    println(mutableVariable)

    // Changing the value of mutable variable
    mutableVariable = "I have been changed"
    println(mutableVariable)

    val randomValue = topLevelFunction()
    println("Random Value from topLevelFunction: $randomValue")
    println("courseName is: $courseName")
}