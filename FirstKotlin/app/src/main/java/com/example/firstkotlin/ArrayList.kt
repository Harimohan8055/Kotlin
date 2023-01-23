package com.example.firstkotlin

fun main(args: Array<String>) {
    var age = ArrayList<Int>()

    age.add(10)
    age.add(1, 20)
    age.add(30)

    println(age[0])
    println(age[1])
    println("Third Element = ${age[2]}")
    age.removeAt(2)
    println(age.size)

    var cars = arrayListOf<String>("BMW", "Benz")

    cars.add("Ferrari")

    println(cars.size)

    var mixArray = ArrayList<Any>()

    mixArray.add("BMW")
    mixArray.add(1, 20)
    mixArray.add(30.4741631)

    println(mixArray[0])
    println(mixArray[1])
    println("Third Element = ${mixArray[2]}")


}