package from41to50.k047

class Person
{
    var name:String = ""
    var age:Int = 0
}
// 클래스 선언

fun main(args:Array<String>)
{
    val person:Person
    person = Person() //Person 함수 - 객체를 생성, Person 타입의 참조를 반환
    person.name = "Paul"
    person.age = 25

    val person2 = Person()
    person2.name = "Kate"
    person2.age = 21

    val person3 = Person()
    person3.name = "Eva"
    person3.age = 30
    // 참조 변수는 반드시 초기화되어야 한다. Person()
}