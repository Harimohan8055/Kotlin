package com.example.objectorientedconcepts

fun main(args: Array<String>) {

    var car = Car()
    car.type = "Car"
    car.model = "Ferrari"
    car.maxSpeed = 100

    car.show()

    var motorCycle = MotorCycle()
    motorCycle.type = "Bike"
    motorCycle.model = "Hero"
    motorCycle.maxSpeed = 150

    motorCycle.show()

}