package com.example.objectorientedconcepts.override

class Car : Vehicle() {

    fun superStart(){
        super.start()
    }
    fun superAccelerate(speed:Int){
        super.accelerate(speed)
    }
    fun superStop(){
        super.stop()
    }

    override fun start(){
        println("Car started")
    }
    override fun accelerate(speed:Int){
        println("Car accelerates at $speed")
    }
    override fun stop(){
        println("Car stopped")
    }

}