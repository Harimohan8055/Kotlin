package com.example.firstkotlin

fun main(args: Array<String>) {

    var a:String = "Hello Kotlin"
    var b:String = "Language"
    var age:Int = 25
    println(a + " " + b)
    println("Age = "+age)

    var x:String = "Kotlin"
    println(x.length)

    println(x.equals("Java"))
    println(x.isEmpty())
    println(x.isBlank())
    println(x.plus(" Language"))
    println(x.uppercase())
    println(x.lowercase())

    var y:String = "   Android   "
    println(x + y)
    println(x + y.trim())

}