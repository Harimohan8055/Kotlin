package com.example.objectorientedconcepts.override

fun main(args: Array<String>) {

    var vehicle = Vehicle()

    vehicle.start()
    vehicle.accelerate(80)
    vehicle.stop()

    var car = Car()

    car.start()
    car.accelerate(100)
    car.stop()

    car.superStart()
    car.superAccelerate(150)
    car.superStop()


}