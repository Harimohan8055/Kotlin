package com.example.objectorientedconcepts.abstract

fun main(args: Array<String>) {

    var car = Car(2015)
    car.speed = 300
    println("Car name: ${car.vehicleName("Ferrari")}")
    println("Type: ${car.vehicleType("Car")}")
    println("Model: ${car.model}")
    println("Speed: ${car.speed}")
}