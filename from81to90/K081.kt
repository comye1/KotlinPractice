package from81to90

open class Person(val name:String, val age:Int)
class Student(name:String, age:Int, val id:Int): Person(name,age)


/*
    Down Casting
    as 연산자
    person as Student
    객체 person을 Student 타입으로 캐스팅한다.
    (person은 Student 객체를 가리키므로 다운캐스팅됨)
    (person2는 Person 객체를 가리키므로 다운캐스팅되지 못함)
 */
fun main(args:Array<String>)
{
    val person: Person = Student("George", 29, 102837)

    val person2: Person = Person("Burke", 37)

    var person3:Student? = person as Student
//    person3 = person2 as Student //ClassCastException --> as? 를 사용하면 null을 받을 수 있다.
    person3 = person2 as? Student // null을 반환할 수 있으므로 person3 타입도 Student?가 되어야 함

}