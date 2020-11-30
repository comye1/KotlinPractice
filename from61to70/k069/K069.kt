package from61to70.k069

open class Person(val name:String, val age:Int)
{
    open fun print()
    {
        println("name : $name")
        println("age : $age")
    }
}

fun main(args:Array<String>)
{
    // 클래스를 상속하여 객체 만들기 - 1회용
    val custom:Person = object :Person("Susan", 54)
    {
        override fun print()
        {
            println("It is a object")
        }
    }

    custom.print()
}