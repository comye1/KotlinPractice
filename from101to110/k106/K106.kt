package from101to110.k106

/*
함수 참조
 */

fun plus(a:Int, b:Int) = println("plus 호출됨 ${a+b}")

object Object
{
    fun minus(a:Int, b:Int) = println("Object의 minus 호출됨 ${a-b}")
}

class Class
{
    fun average(a:Int, b:Int) = println("Class average 호출됨 ${(a+b)/2}")
}

fun main(args:Array<String>)
{
    var instantFunc:(Int, Int) -> Unit
    instantFunc = ::plus
    instantFunc(50,25)

    instantFunc = Object::minus //참조 변수의 멤버
    instantFunc(34,12)

    instantFunc = Class()::average //함수 객체를 생성한 뒤 참조
    instantFunc(29,35)
}