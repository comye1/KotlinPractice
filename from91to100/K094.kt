package from91to100

/*
    동반자 객체의 확장 함수
 */

class Person{ companion object } //동반자 객체 정의

fun Person.Companion.create() = Person() //동반자 객체에 함수 주입

fun main(args:Array<String>)
{
    Person.create() //동반자 객체 함수 호출
}