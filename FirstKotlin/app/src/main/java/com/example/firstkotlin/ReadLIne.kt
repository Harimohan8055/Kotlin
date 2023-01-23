package com.example.firstkotlin

fun main(args: Array<String>) {

    println("Name?")

    var name:String? = readLine()

    println(name)

    println("age?")

    var age:Int? = readLine()!!.toInt()

    println(age)

}