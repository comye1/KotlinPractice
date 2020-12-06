package from91to100

/*
    lateinit - 바로 초기화하지 않아도 된다 (var)
 */
class Point(val x:Int, val y:Int)

class Rect
{
    lateinit var pt:Point
    lateinit var pt2:Point

    //getter 커스터마이징 - 실시간으로 계산
    val width:Int get() = pt2.x - pt.x
    val height:Int get() = pt2.y - pt.y
    val area:Int get() = width * height
}

fun main(args:Array<String>){
    val rect = Rect()
    rect.pt = Point(3,3)
    rect.pt2 = Point(6,5)

    println("w : ${rect.width}")
    println("h : ${rect.height}")
    println("a : ${rect.area}")
}