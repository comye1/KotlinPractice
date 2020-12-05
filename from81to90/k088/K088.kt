package from81to90.k088
/*
Object Declaration
프로그램 전체에서 공유할 수 있는 하나뿐인 객체 선언 (클래스처럼)
 */
object Person
{
    var name:String = ""
    var age:Int = 0
    fun print()
    {
        println(name)
        println(age)
    }
}

fun main(args:Array<String>)
{
    Person.name = "Monica"
    Person.age = 36
    Person.print()

    val person:Person = Person
    person.print()
}