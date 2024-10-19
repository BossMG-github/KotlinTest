package com.example.kotlintest.Kotlin.ch3_2


fun main() {
    var data = 10
    if (data > 10) {
        println("data > 10")
    } else if (data > 0 && data <= 10) {
        println("data > 0 && data <= 10")
    } else {
        println("data <= 0")
    }

    // if else를 표현식으로 사용 가능
    // 표현식은 결과값을 반환하는 계산식
    // 마지막 줄의 결과만 반환을 받음
    val result2 = if (data > 0) {
        println("result2 값 대입")
        10
    } else {
        null
    }

    val result: Boolean = if (data > 0) {
        println("data > 0")
        true
    } else {
        println("data <= 0")
        false
    }
    println(result)
    println(result2)

    // when 조건문
    // 소괄호 안에 넣은 데이터가 조건이 됨
    // 그 값에 따라 구문이 실행됨
    when (30) {
        10 -> println("data is 10")
        20 -> println("data is 20")
        30 -> {
            println("data is 30")
            println("여러 줄도 가능")
        }

        else -> {
            println("data is not valid data")
        }
    }
    // when 조건으로 정수가 아닌 다른 타입도 가능
    when ("hello") {
        "hello" -> println("data is hello")
        "world" -> println("data is world")
        else -> println("data is not valid data")
    }

    var whendata: Any = 10
    when (whendata) {
        is String -> println() // data가 문자열 타입이면
        20, 30 -> println() // data가 20 또는 30이면
        in 1..10 -> println() // data가 1~10이면
        else -> println()
    }
    // is는 타입 확인 연산자
    // in은 범위 지정 연산자

    // 데이터를 명시 안하고 조건만 명시 가능

    // when 표현식 가능
    var whenData2 = 10
    val whenResult = when {
        whenData2 >= 0 -> "data is >= 0"
        whenData2 > 100 -> "data is > 100"
        else -> "data is valid"
    }
    println(whenResult)

    // for
    var sum = 0
    for(i in 1..10){
        sum += i
    }
    println(sum)

    // 증감 조건을 숫자로 명시 하지 않고 컬렉션 타입의 데이터 개수만큼 반복 가능
    var dataFor = arrayOf<Int>(10,20,30)
    for(i in dataFor.indices){ // 컬렉션 타입의 인덱스 값이 i에 대입 됨 즉 0,1,2가 대입됨
        print(dataFor[i])
        if(i != dataFor.size -1) print(",") // 마지막 인덱스2가 되면 실행 X
    }

    println()

    // 인덱스와 실제 데이터를 함께 가져오기
    for((index, value) in dataFor.withIndex()){
        print(value)
        if (index !== dataFor.size -1) print(",")
        // !== 은 객체가 다른지 확인
    }

    println()

    // while
    var x = 1
    var sum1 = 0
    while(x <= 10){
        sum1 += x++
    }
    println(sum1)
}