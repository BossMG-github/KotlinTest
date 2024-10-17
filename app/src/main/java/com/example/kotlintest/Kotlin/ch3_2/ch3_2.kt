package com.example.kotlintest.Kotlin.ch3_2


val data1 : Any = 10
var data2 : Any = "Hello" // 모든 타입 가능

val data3: Nothing? = null // Nothing 타입 변수에는 null만

fun some1(): Nothing? {
    return null
}

fun some2(): Nothing { // 반환은 하지만 의미 있는 값은 아니라는 의미
    // 예외를 던지는 함수나 null를 반환하는 함수에 Nothing 키워드
    throw Exception()
}

var data4:Int? = 10

fun main(){
    data4 = null // 타입 뒤에 ?를 추가 하면 널 허용

    fun sum(no : Int) : Int{
        var sum = 0
        for( i in 1..no){
            sum += i
        }
        return sum
    }

    val name = "Son"
    println("name : $name, sum : ${sum(10)}, plus : ${10 + 20}")
}

fun some(): Unit { // 반환문이 없는 함수 fun some(){}와 같음
    println(10+20)
}