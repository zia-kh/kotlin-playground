package com.kotlinplayground.basics

fun main() {
    //val salary : Long = 4500L
    val salary = 4500L
    println(salary)

    // String interpolation
    val name = "John"
    println("Hello, $name! Your salary is $salary. ${name.length} characters in your name.")

    // multi-line string
    val multiLineString = """
        This is a multi-line string.
        It can span multiple lines.
        Indentation is preserved.
    """.trimIndent()
    println(multiLineString)

}