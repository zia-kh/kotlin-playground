package com.kotlinplayground.classes


class Person(val name: String = "John Doe", val age: Int = 30) {
    var email: String = ""
    var nameLength: Int = 0

    init {
        println("Inside init block")
        nameLength = name.length
    }

    constructor(
        _email: String,
        _name: String = "",
        _age: Int = 0
    ) : this(_name, _age) {
        this.email = _email
    }

    fun action() {
        println("Person is taking action.")
    }
}

fun main() {
      val person = Person()
      person.action()
      println("Name  is : ${person.name} and Age are : ${person.age}")
      val person1 = Person("zia", 25)
      person1.action()
      println("Name  is : ${person1.name} and Age are : ${person1.age}")

      // Using secondary constructor
      val person3 = Person(_email = "zk@g.com")
      person3.action()
      println("Name  is : ${person3.name} and Age are : ${person3.age} and Email is : ${person3.email}")

    val person2 = Person("zia@gmail.com", "Zia", 40)
    person2.action()
    println("Name  is : ${person2.name} and Age are : ${person2.age} and Email is :" +
            " ${person2.email} and Name Length is : ${person2.nameLength}")

}