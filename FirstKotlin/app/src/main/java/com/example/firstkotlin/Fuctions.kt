package com.example.firstkotlin

fun main(args: Array<String>) {

    println("Enter the numbers")
    var x:Int = readLine()!!.toInt()
    var y:Int = readLine()!!.toInt()
    show(x,y)
    println(add(x,y))
    println(findMinimumNumber(x,y))

}
fun show(num1:Int, num2:Int): Unit{
    println("num1 = $num1")
    println("num2 = $num2")
}

fun add(num1: Int, num2: Int):Int {
    return num1 + num2
}

fun findMinimumNumber(num1: Int, num2: Int): Int {
    return if (num1 > num2) num2 else num1
}