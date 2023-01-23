package com.example.firstkotlin

fun main(args: Array<String>) {

    var age = mapOf<String,Int>("david" to 20, "ronaldo" to 25)
    println(age["david"])
    println(age["ronaldo"])
    println(age.keys)
    println(age.entries)
    println(age.size)

    var mutableage = mutableMapOf<String,Int>("david" to 20, "ronaldo" to 25)
    mutableage.put("hari",25)

    print(mutableage.entries)


}