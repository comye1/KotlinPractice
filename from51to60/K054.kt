package from51to60

class Person constructor(name:String, age:Int = 0) //생성자 매개변수
{
    val name:String
    val age:Int

    init //초기화 블록
    {
        this.name = name
        this.age = age
    }
}

fun main(args:Array<String>)
{
    val person = Person("김연아", 30)
    println("name : ${person.name}")
    println("age : ${person.age}")

    val baby = Person("Monica") //baby.age = 0
    println(baby.name + " " + baby.age)
}