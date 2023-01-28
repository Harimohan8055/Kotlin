package com.example.objectorientedconcepts

fun main(args: Array<String>) {

//    var myCar = Cars()
//    myCar.name = "Ferrari"
//    myCar.model = 2015
//
//    println("car is ${myCar.name} and model is ${myCar.model}")

//    var myNewCar = MyCars("Ferrari", 2021)
//    println("car is ${myNewCar.name} and model is ${myNewCar.model}")

    var mySecondCar = MySecondCars("Ferrari",2015)

    mySecondCar.name = "Suzuki"
//    mySecondCar.model = 2007

    println("car is ${mySecondCar.name} and model is ${mySecondCar.model}")

}