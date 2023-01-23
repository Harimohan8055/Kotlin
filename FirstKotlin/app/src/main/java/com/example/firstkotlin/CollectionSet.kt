package com.example.firstkotlin

fun main(args: Array<String>) {

//    var mySetArray = arrayListOf<Any>("Hello", 2, 2.5, 'K', true, "Hello")
//    println(mySetArray.size)
//    println(mySetArray.last())

    var mySetArray = setOf<Any>("Hello", 2, 2.5, 'K', true, "Hello", false)
    println(mySetArray.size)
    println(mySetArray.last())
}