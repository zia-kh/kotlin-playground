package com.kotlinplayground.basics

fun main() {

    val range = 1..10
    for (num in range) {
        println("num $num ")
    }
    val reverseRange = 10 downTo 1
    for (num in reverseRange)
        println("reverse num $num ")

    val stepRange = 1..10 step 2
    for (num in stepRange)
        println("step num $num ")

    val charRange = 'A'..'Z' step 2
    for (char in charRange)
        println("$char ")

    exploreWhileLoop()
    exploreDoWhile()
}

fun exploreWhileLoop() {
    var x = 1
    while (x <= 10) {
        println("x: $x")
        x++
    }
}

private fun exploreDoWhile() {
    var y = 10
    do {
        println("y: $y")
        y--
    } while (y >= 1)
}