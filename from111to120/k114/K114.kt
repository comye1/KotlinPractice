package from111to120.k114

import org.w3c.dom.css.Rect

/*
제네릭이 적용된 클래스, 인터페이스를 상속/구현하기
 */

interface Plusable<T>
{
    operator fun plus(other:T):T
}

class Rectangle(val width:Int, val height:Int):Plusable<Rectangle>//Rectangle 덧셈 인터페이스를 상속
{
    override fun plus(other: Rectangle) = //인터페이스 구현
        Rectangle(width + other.width, height + other.height)

    override fun toString() = "width:$width, height:$height"
}

fun main(args:Array<String>)
{
    val rect = Rectangle(10,5)
    val rect2 = Rectangle(3,6)

    println(rect+rect2) //toString 호출
}