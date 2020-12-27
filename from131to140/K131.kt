package from131to140

/*
Comparable 인터페이스 - 클래스를 비교 가능하게

interface Comparable<in T>
{
    operator fun compareTo(other:T):Int //이 인터페이스를 상속한 클래스 끼리 비교 (> < <= >=)
}
.. 연산자 지원
 */

class Rectangle(val width:Int, val height:Int):Comparable<Rectangle>
{
    val area = width*height

    override fun compareTo(other: Rectangle):Int=
        when
        {
            this.area > other.area -> 1
            this.area < other.area -> -1
            else -> 0
        }
}

fun main(args:Array<String>)
{
    val rect = Rectangle(3,5) //15
    val rect2 = Rectangle(6,4) //24
    val rect3 = Rectangle(8,2) //16

    println(rect >= rect3)  //false
    println(rect < rect2)   //true
    println(rect2 > rect3)  //true

    println(rect.compareTo(rect2))  //-1
}

