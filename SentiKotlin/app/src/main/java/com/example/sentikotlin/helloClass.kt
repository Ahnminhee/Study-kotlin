package com.example.sentikotlin

fun main() {

    var cls = HelloClass()
    var cls2 = HelloClass(3)

    println(cls2.age)

    var person = Person(21, "renjun")

    println(person.age)
    println(person.name)
}

class HelloClass {
    var age: Int =0
    init {

    }

    constructor()
    constructor(age: Int) {
        this.age = age
    }

}

data class Person(var age: Int, val name: String) {

}