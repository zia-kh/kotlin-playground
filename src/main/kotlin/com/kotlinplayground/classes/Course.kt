package com.kotlinplayground.classes

data class Course(
    val id: Int,
    val name: String,
    val author: String
)

fun main() {
    val course1 = Course(1, "Kotlin Basics", "John Doe")
    val course3 = Course(1, "Kotlin Basics", "John Doe")
    val course2 = Course(2, "Advanced Kotlin", "Jane Smith")

    println("Course 1: $course1")
    println("Course 2: $course2")
    println("Course 1 equals Course 3: ${course1 == course3}")

    val course4 = course1.copy(id = 3, name = "Kotlin for Experts")
    println("Course 4 (copied from Course 1 with modifications): $course4")
    println("course 1 after copy : $course1")
}