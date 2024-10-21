package com.example.kotlintest.Kotlin.ch3_2




fun main(){
    // 널 안정성을 개발자가 고려한 코드
    var data : String? = null
    val length = if(data == null){
        0
    } else {
        data.length
    }
    println("data length : $length")

    // 똑같은 실행문을 다르게
    println("data length : ${data?.length ?: 0}")

    // null이 대입될 수 있는 변수를 널 안정성을 고려하지 않고 작성하면 오류 발생
    // 널 허용으로 선언한 변수의 멤버에 접근 할 때는 ?. 연산자를 이용해야함
    var length2 = data?.length
    // ?. 연산자는 변수가 null이 아니면 멤버에 접근하고 null이면 null을 반환함

    // 엘비스 연산자 ?:
    // 변수가 널일 때 대입해야 하는 값이나 실행해야 하는 구문이 있을 때 사용함
    var data2 : String? = "Son"
    println("data = $data2 : ${data2?.length ?: -1}")
    data2 = null
    println("data = $data2 : ${data2?.length ?: -1}")

    // 예외 발생 연산자 !!
    // 객체가 널일 때 예외를 일으키는 연산자
    // 널이면 예외를 발생시켜야 할 때 사용
    fun some(data: String?): Int {
        return data!!.length
    }

    println(some("Son"))
    println(some(null)) // 널이면 !! 연산자로 인해 예외 발생
}