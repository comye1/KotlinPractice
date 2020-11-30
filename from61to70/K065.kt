package from61to70

import from61to70.k069.Person

open class Person(val name:String, val age:Int)

class Student(name:String, age:Int, val id:Int): Person(name, age)

fun main(args:Array<String>)
{
    val person: Person = Student("Lisa", 45, 2738142)
    //업캐스팅 : subclass -> superclass (일부만 가리킴)
    //id 접근 불가능
    //다시 student로 캐스팅 불가능
}