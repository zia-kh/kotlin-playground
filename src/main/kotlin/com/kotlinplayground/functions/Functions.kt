package com.kotlinplayground.functions

fun main() {
    printName("Zia")
    val result = addition(5, 10)
    println("Sum: $result")

    val resultApproach = additionApproach(7, 3)
    println("Sum (approach): $resultApproach")
}

fun addition(x: Int, y: Int): Int {
    return x + y
}

fun additionApproach(x: Int, y: Int) = x + y

fun printName(name: String) {
    println("Name: $name")
}
