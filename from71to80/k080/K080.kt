package from71to80.k080

/*
is 연산자 => 실제 가리키는 객체의 타입 (그 타입으로 가리킬 수 있는지)
 */
open class Person(val name:String, val age:Int)

class Student(name:String, age:Int, val id:Int): Person(name,age)

class Professor(name:String, age:Int): Person(name, age)

// Person -> Person
// Person -> Student
// Person -> Professor
// Student -> Student
// Professor -> Professor

fun main(args:Array<String>)
{
    val person: Person = Student("Derek", 39, 10593827)

    print("${person is Person}")    //true
    print("${person is Student}")   //true
    print("${person is Professor}") //false

    val person2: Person = Professor("Meredith", 27)

    print("${person2 is Person}")   //true
    print("${person2 is Student}")  //false
    print("${person2 is Professor}")//true
    print("${person2 !is Student}") //true

    /*
    when(person)
    {
        is Person -> {}
        is Student -> {}
        is Professor -> {}
    }
     */
}
