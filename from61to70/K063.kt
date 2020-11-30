package from61to70

class Point(var x:Int = 0, var y:Int = 0)
{
    infix fun from(base:Point):Point //중위표기함수
    {
        return Point(x-base.x, y-base.y) //base 기준 좌표
    }
}

fun main(args:Array<String>)
{
    val pt = Point(11,5) from Point(1,-4)
    // 앞의 Point가 호출, 뒤의 Point는 파라미터(base)
    // Point(11,5).from(Point(1,-4))
    println("(${pt.x}, ${pt.y})")
}