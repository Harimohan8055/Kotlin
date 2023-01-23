package com.example.firstkotlin

fun main(args: Array<String>) {

    println("Enter the day:")
    var day:Int = readLine()!!.toInt()

    when(day){
        1-> println("Monday")
        2-> println("Sunday")
        3-> println("Tuesday")
        4-> println("Wednesday")
        5-> println("Thursday")
        6-> println("Friday")
        7-> println("Saturday")
        else-> println("Invalid")
    }

}