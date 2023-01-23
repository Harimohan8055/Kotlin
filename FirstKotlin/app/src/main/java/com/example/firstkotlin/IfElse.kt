package com.example.firstkotlin

fun main(args: Array<String>) {

    println("Enter the number")
    var num:Int = readLine()!!.toInt()

    if(num % 2 == 0){
        println("Even")
    }
    else{
        println("Odd")
    }

}