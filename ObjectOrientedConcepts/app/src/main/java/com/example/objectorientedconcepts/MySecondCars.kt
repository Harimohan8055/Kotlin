package com.example.objectorientedconcepts

class MySecondCars {

    var name:String? = null
    var model:Int? = null
        private set


    //    constructor(name1:String,model1:Int){
//        this.model = model1
//        this.name = name1
//    }

    constructor(name: String?, model: Int?) {
        this.name = name
        this.model = model
    }


}