package com.example.kotlintest.Kotlin.ch3_2

open class Super {

}

class Sub : Super() {

}

open class Super2(name: String) {

}

class Sub2(name: String) : Super2(name) {

}

open class Super3(name: String){

}

class Sub3: Super3{
    constructor(name: String) : super(name){

    }
}

open class Super4(){
    var superData = 10
    fun superFun(){
        println("i am superFun : $superData")
    }
}

class Sub4: Super4()

fun main(){
    val obj = Sub4()
    obj.superData = 20
    obj.superFun()
}