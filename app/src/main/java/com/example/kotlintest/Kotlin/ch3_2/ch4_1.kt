package com.example.kotlintest.Kotlin.ch3_2

class User {
    var name = "Son"
    constructor(name: String){
        this.name = name
        println("User 생성")
    }
    fun someFun(){
        println("name : $name")
    }
    class SomeClass{ }
}

class User2(name: String, count: Int){
    var name: String
    var count: Int
    init {
        println("User2 생성")
        this.name = name
        this.count = count
        // println("name : ${name} || count : ${count}")
    }
    // init은 보조 생성자로 객체 생성할 때도 실행되지만 보조 생성자는 클래스 안에 선언해야하기 때문에
    // 주 생성자의 본문을 구현하는 용도로 쓰임

    fun someFun(){
        println("name : $name || count : $count")
    }
}

class User3(var name: String, var count: Int){
    // 클래스 멤버 변수를 선언하지 않고 생성자의 매개변수를 var나 val 키워드로 선언함으로써 생성자의 매개변수이면서 클래스의 멤버 변수가 됨
    init {
        println("User3 생성")
    }

    fun someFun(){
        println("name : $name || count : $count")
    }
}

class User4{
    // 보조 생성자는 클래스 본문에 constructor 키워드로 선언하는 함수를 말함
    // 주 생성자는 하나만 가능하지만 보조 생성자는 여러 개 가능
    constructor(name: String){
        println("constructor(name: String) call")
    }
    constructor(name: String, count: Int){
        println("constructor(name: String, count: Int) call")
    }
}
// 생성자는 주 생성자와 보조 생성자가 있음 둘 중 하나만 선언 하는 것도 가능함
// 주 생성자랑 보조 생성자를 모두 선언해야한다면 반드시 생성자끼리 연결해줘야함
// 이런 규칙이 있는 이유는 공통된 코드는 주 생성자에 작성하라는 의미가 있을 수 있음
// 그리고 필수 매개변수나 실행 구문이 주 생성자에 있을 확률이 크기 때문임.
// 즉 1. 완전한 초기화 보장
// 2. 중복 코드 방지
class User5(name: String){
    constructor(name: String, count: Int) : this(name){
        println("User5 생성")
    }
}

// 보조 생성자가 여럿일 때 생성자 연결
class User6(name: String){
    constructor(name: String, count: Int) : this(name){
        println("name: String, count: Int")
    }
    constructor(name: String, count : Int, email: String): this(name, count){
        println("name: String, count: Int, email: String")
    }
    init {
        println("name: String")
    }
}

fun main(){
    val user = User("son")
    val user2 = User2("son", 10)
    user.someFun()
    user2.someFun()
    val user3 = User3("son", 20)
    user3.someFun()
    val user4 = User4("son")
    val user4_2 = User4("son",30)
    val user5 = User5("son", 50)
    val user6 = User6("son", 60, "a@a.com")
}