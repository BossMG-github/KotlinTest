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


    // 컬렉션 타입 : 여러 개의 데이터를 표현하는 방법 Array List Set Map이 있음

    // Array
    val arr: Array<Int> = Array(3,{0}) // 배열 생성자는 배열 크기와 초깃값을 매개값으로 받음
    arr[0] = 10
    arr[1] = 20
    arr.set(2,30)
    println("""
        array size : ${arr.size}
        array data : ${arr[0]}, ${arr[1]}, ${arr.get(2)}
    """.trimIndent())
    // arrayOf로 선언과 동시에 값을 할당
    val arr2: Array<Int> = arrayOf(10,20,30)
    println("""
        array2 size : ${arr2.size}
        array2 data : ${arr2[0]}, ${arr2[1]}, ${arr2.get(2)}
    """.trimIndent())
    // 기초타입배열
    val arrInt: IntArray = intArrayOf(10,20,30)
    val arrBool: BooleanArray = booleanArrayOf(true,false,false)

    // 컬렉션 타입 클래스
    // list 불변
    val list: List<Int> = listOf(10,20,30) // listOf 메소드로 리스트 객체 생성
    println("""
        list size : ${list.size}
        list data : ${list[0]}, ${list[1]}, ${list.get(2)}
    """.trimIndent())

    var mutableList: MutableList<Int> = mutableListOf(10,20,30) // mutableListOf 메소드로 가변 리스트 객체 생성
    mutableList.add(3,40)
    mutableList.add(0,60) // 들어있는 인덱스에 값을 넣으면 원래 있던 값들이 뒤로 밀려남 set을 해야 그 인덱스 값이 바뀜
    println("""
        mutableList size : ${mutableList.size}
        mutableList data : ${mutableList[0]}, ${mutableList[1]}, ${mutableList.get(2)}, ${mutableList.get(3)}, ${mutableList.get(4)}
       
    """.trimIndent())

    val map: Map<String,String> = mapOf(Pair("one","hello"), "two" to "world")
    println("""
        map size : ${map.size}
        map data : ${map.get("one")}, ${map.get("two")}
    """.trimIndent())

    var mutableMap: MutableMap<String,String> = mutableMapOf(Pair("three", "name"), "four" to "Son")
    mutableMap.set("Exit","종료")
    println("""
        mutableMap : size = ${mutableMap.size}
        mutableMap : data = ${mutableMap.get("three")}, ${mutableMap.get("four")}, ${mutableMap.get("Exit")}
    """.trimIndent())
}

fun some(): Unit { // 반환문이 없는 함수 fun some(){}와 같음
    println(10+20)
}