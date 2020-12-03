package from71to80

import from71to80.k080.Person

open class Person(val name:String, val age:Int)

//class Student(name:String, age:Int, val id:Int): Person(name, age)

fun main(args:Array<String>)
{
    //타입 이름 뒤에 ?를 붙이면 변수를 Nullable하게 만들 수 있음
    // null(Nothing? 타입) 대입 가능
    var person: Person? = Person("Lee",29)
    person = null

    var num:Int? = null
    num = 10

    //? 붙일 시 참조 변수로 선언됨 (힙 영역에 데이터 생성)
    //null 지정 시 힙 영역의 인스턴스와 연결이 끊어짐

    if (true) "Test" //String
    else null //Nothing?
    // 표현식 ==> String? 타입
}