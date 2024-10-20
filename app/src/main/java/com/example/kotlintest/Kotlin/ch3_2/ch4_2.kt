package com.example.kotlintest.Kotlin.ch3_2

open class Super {

}

class Sub : Super() {

}

open class Super2(name: String) {

}

class Sub2(name: String) : Super2(name) {

}

open class Super3(name: String) {

}

class Sub3 : Super3 {
    constructor(name: String) : super(name) {

    }
}

open class Super4() {
    var superData = 10
    fun superFun() {
        println("i am superFun : $superData")
    }
}

class Sub4 : Super4()

open class Super5() {
    open var someData = 10
    open fun someFun() {
        println("i am super class function : $someData")
    }
}

class Sub5 : Super5() {
    override var someData = 20
    override fun someFun() {
        println("i am sub class function : $someData")
    }
}

open class Super6{
    var publicData = 10
    protected var protectedData = 20
    private var privateData = 30
}

class Sub6 : Super6(){
    fun subFun(){
        publicData++
        protectedData++
        // privateData++
    }
}

fun main() {
    val obj = Sub4()
    obj.superData = 20
    obj.superFun()

    val obj2 = Sub5()
    obj2.someFun()

    val obj3 = Super6()
    obj3.publicData
    //obj3.protectedData
    //obj3.privateData
}