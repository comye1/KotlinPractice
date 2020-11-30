package from61to70.k64

open class Person(val name:String, val age:Int)
// open 키워드 - 상속 허용 (기본 : final) => Superclass

class Student(name:String, age:Int, val id:Int):Person(name,age)
// Person을 상속함 => Subclass
// Person 생성, 프로퍼티와 함수가 서브클래스에 복사됨

fun main(args:Array<String>)
{
    val person = Person("Kang", 35)
    val student = Student("Park", 36, 142534)
}