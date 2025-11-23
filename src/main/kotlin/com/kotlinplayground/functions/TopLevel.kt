package com.kotlinplayground.functions

const val courseName = "Kotlin Programming"

fun topLevelFunction(): Int {
    return (0..40).random()
}

fun main() {
    val randomValue = topLevelFunction()
    println("Random Value: $randomValue")

}

