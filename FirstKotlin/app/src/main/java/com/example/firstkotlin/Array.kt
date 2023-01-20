package com.example.firstkotlin

fun main(args: Array<String>) {

    var age = arrayOf(1,2,3,4,5,6)
    println(age[0])
    println(age.get(1))

    age.set(0,0)
    println(age[0])

    println(age.size)

    var carage = arrayOf("BMW",1)
    println(carage[0])
    println(carage[1])



}