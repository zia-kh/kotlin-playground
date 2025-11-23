package com.kotlinplayground.classes

class Item() {
    var name: String = ""
    var price: Double = 0.0
        get() {
            println("Insite getter for price")
            return field
        }
        set(value) {
            println("Insite setter for price")
            if (value >= 0.0)
                field = value
            else
                throw IllegalArgumentException("Price cannot be negative")
        }

    constructor(_name: String) : this() {
        this.name = _name
    }
}

fun main() {
    val item1 = Item()
    item1.name = "Default Item"
    println("Item 1 Name: ${item1.name}")
    println(item1.price)
    item1.price = 25.5
    println("Item 1 Price: ${item1.price}")

    val item2 = Item("Custom Item")
    println("Item 2 Name: ${item2.name}")
    item2.name = "Updated Custom Item"
    println("Item 2 Updated Name: ${item2.name}")
}