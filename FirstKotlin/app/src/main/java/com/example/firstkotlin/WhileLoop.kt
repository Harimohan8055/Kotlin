package com.example.firstkotlin

import kotlin.random.Random

fun main(args: Array<String>) {

    var i:Int = 0

    while (i <= 10){
        println(i)
        i++
    }
    var k = 1
    var fact = 1
    while (k<6){
        fact *= k
        println("$k! = $fact")
        k++
    }

    val num = Random.nextInt(0,100)
    println("enter the number:")

    while (true){
        val inp:Int = readLine()!!.toInt()
        if (inp == num){
            println("Equal")
            break
        }else if (inp > num){
            println("Decrease")
        }else{
            println("Increase")
        }
    }
}