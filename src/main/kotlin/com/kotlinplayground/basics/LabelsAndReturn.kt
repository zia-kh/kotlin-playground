package com.kotlinplayground.basics

fun main() {
    for (i in 1..5) {
        println("Outer loop i: $i")
        innerLoop@ for (j in 1..5) {
            if (j == 3) {
                println("Breaking out of inner loop when j is $j")
                break@innerLoop
            }
            println("  Inner loop j: $j")
        }
    }

    label()
    labelReturn()
}

fun label() {
    loop@ for (i in 1..3) {
        println("i: $i")
        innerloop@ for (j in 1..3) {
            if (j == 2) {
                println("Continuing to next iteration of outer loop when j is $j")
                //continue@loop
                break@innerloop
            }
            println("  j: $j")
        }
    }
}

fun labelReturn() {
    loop@ for (i in 1..3) {
        println("i: $i")
        innerloop@ for (j in 1..3) {
            if (j == 2) {
                println("return to next iteration of outer loop when j is $j")
                //continue@loop
                return
            }
            println("  j: $j")
        }
    }
}