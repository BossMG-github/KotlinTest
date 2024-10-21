package com.example.kotlintest.Kotlin.ch3_2

fun sum(no1: Int, no2: Int): Int {
    return no1 + no2
}

// sum 함수를 람다 함수로
val sumFun = { no1: Int, no2: Int -> no1 + no2 }

// 변수의 타입은 함수 타입이라고 생각하면 된다 Any 아님
val sumFun2: (Int, Int) -> Int = { no1: Int, no2: Int -> no1 + no2 }
// 이런 형태


// 타입 별칭 typealias
typealias MyInt = Int
typealias MyFunType = (Int,Int) -> Boolean

// 고차 함수
// 함수를 매개변수로 전달받거나 반환하는 함수를 의미

fun hofFun(arg: (Int) -> Boolean) : () -> String { // arg : 함수타입 / 반환타입은 () -> String인 함수타입
    val result = if(arg(10)){ // 받은 함수 실행문을 실행 true를 리턴함
        "valid"
    } else {
        "invalid"
    }

    return {"hofFun result : $result"}
}

fun main() {
    // 람다 함수 선언과 동시에 호출

    println(sumFun(10, 20))
    val data = { no1: Int, no2: Int -> no1 + no2 }(10, 20)
    println(data)

    val data2 = { -> println("function call") }
    data2()

    // 매개 변수가 1개인 람다 함수
    // it 키워드로 매개 변수를 이용할 수 있음
    val some: (Int) -> Unit = { println(it) }
    some(10)

    // 람다 함수도 함수라서 반환해야할 때가 있음
    // 근데 return 키워드는 사용 못함
    // 본문에서 마지막 줄의 결과가 반환값임

    val some2 = {no1: Int, no2: Int ->
        println("in Lambda function")
        no1 * no2
    }
    println("result : ${some2(10,20)}")

    val data3: MyInt = 10
    val someFun: MyFunType = {no1: Int, no2: Int -> no1 > no2}

    println(someFun(10,20))
    println(someFun(20,10))

    // 매개변수의 타입을 유추 할 수 있다면 함수 선언 매개변수에 타입 생략 가능
    val someFun2 : (Int, Int) -> Boolean = {no1,no2 -> no1 > no2}
    // 반대로 변수 타입도 생략 가능 함수 매개변수로 변수의 타입도 유추 가능

    val result: () -> String = hofFun({no: Int -> no > 0})
    println(result())

}