package com.atilsamancioglu.classesandfunctions

//primary constructor
class Simpson( var name : String, var age: Int, var job: String) {

    private var height = 0

    fun setHeight(num : Int) {
        if (num > 100) {
            height = num
        }
    }

    /*
    //Property
    var name = ""
    var age = 0
    var job = ""
    var weight = 0
    var height = 0

    //Secondary Constructor
    constructor(name : String, age : Int, job : String, weight : Int) {
        this.name = name
        this.age = age
        this.job = job
        this.weight = weight
    }

     */

}

