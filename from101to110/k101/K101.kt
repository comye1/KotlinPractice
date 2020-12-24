package from101to110.k101

/*
데이터 클래스 : 데이터만을 속성으로 갖고 있다.
앞에 data 키워드를 붙여 데이터 클래스로 선언
Any 클래스의 equals, hashCode, toString 멤버 함수가 오버라이드된다.
복사함수 copy가 자동으로 선언된다.

제약사항
- 하나 이상의 프로퍼티.
- 생성자 매개변수에 var/val을 같이 써야 한다. (프로퍼티에 대응하지 않는 생성자 매개변수를 가질 수 없다.)
- abstract, open, sealed, inner 키워드를 붙일 수 없다.
- 인터페이스만 구현할 수 있다. (sealed 클래스도 상속 가능)
- component1, component2 와 같은 이름으로 멤버 함수를 선언할 수 없다. (컴파일러가 사용)
 */

data class Employee( val name:String, val age:Int, val salary:Int)

fun main(args:Array<String>)
{
    val first = Employee("John", 30, 3000)
    val second = Employee("Page", 24, 5300)
    val third = first.copy()
    val fourth = first.copy(salary = 4000) //인수 지정 가능

    println(first.toString()) //Employee(name=John, age=30, salary=3000)
    println(third.toString()) // Employee(name=John, age=30, salary=3000)
    println(fourth.toString()) //Employee(name=John, age=30, salary=4000)
    println(first == second) //false :equals 멤버 함수를 호출한다.
    println(first == third) //true :프로퍼티 값을 비교한다.
}