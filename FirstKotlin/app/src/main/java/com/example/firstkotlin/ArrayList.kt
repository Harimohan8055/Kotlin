package com.example.firstkotlin

fun main(args: Array<String>) {
    var age = ArrayList<Int>()

    age.add(10)
    age.add(1,20)
    age.add(30)

    println(age[0])
    println(age[1])
    println("Third Element = ${age[2]}")


}