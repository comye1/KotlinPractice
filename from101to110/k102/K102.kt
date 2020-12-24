package from101to110.k102

data class Employee( val name:String, val age:Int, val salary:Int)

/*
객체 분해하기 : "데이터 클래스에 한해" 객체를 여러 개의 변수로 쪼갤 수 있다.
 */

fun main(args:Array<String>)
{
    val (name, _, salary) = Employee("John", 30, 3300) //_로 무시하기
    println(name);println(salary) //John 3300
}