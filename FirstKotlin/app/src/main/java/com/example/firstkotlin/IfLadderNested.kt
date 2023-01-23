package com.example.firstkotlin

fun main(args: Array<String>) {

    println("Enter age:")
    var age:Int = readLine()!!.toInt()
    if(age < 13){
        println("child")
    } else if(age< 19){
        println("Teen")
    }else{
        if(age < 65) {
            println("adult")
        }else{
            println("Senior")
        }
    }


}