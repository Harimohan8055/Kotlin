package com.example.firstkotlin

fun main(args: Array<String>) {

    var sum:Int = 0
//    for (num in 0..10 step 2){
//        sum += num
//        println(num)
//    }
//    println("Sum = $sum")

    for (num in 10 downTo 0 step 2){
        sum += num
        println(num)
    }
    println("Sum = $sum")

//    var myNumArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
//    for(i in myNumArray){
//        println(i)
//    }
//
//    for(y in myNumArray.indices){
//        println("myNumArray[$y] = ${myNumArray[y]}")
//    }
//
//    myNumArray.forEach { println(it) }
}