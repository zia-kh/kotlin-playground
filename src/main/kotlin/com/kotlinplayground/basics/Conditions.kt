package com.kotlinplayground.basics

fun main() {
    // if-else condition
    // Expression always returns a value
    val age = 20
    val result = if (age >= 18) {
        println("You are an adult.")
        age
    } else {
        println("You are a minor.")
        age
    }
    println("Age is: $result")

    // when condition
    // when block allows us to write concise and expressive code when dealing with multiple conditions
    val dayOfWeek = 5
    val dayName = when (dayOfWeek) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
    println(dayName)
}