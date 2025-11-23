package com.kotlinplayground.functions

import java.time.LocalDate

fun main() {
    printPersonDetails(name = "zia", email = "zkhos@gmail.com")
    printPersonDetails(name = "zk", dob = LocalDate.parse("2010-01-01"), email = "zkhos@gmail.com")
    printPersonDetails(dob = LocalDate.parse("2000-01-01"), name = "zia-khos")
    printPersonDetails("zia-khos")
}

fun printPersonDetails(
    name: String,
    dob: LocalDate = LocalDate.now(),
    email: String = ""
) {
    println("Name: $name date of birth: $dob email: $email")
}
