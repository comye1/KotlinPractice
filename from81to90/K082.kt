package from81to90

class Rectangle(private val width:Int, private val height:Int)
{
    val area:Int //public
        get() = width * height //public

    //생성자, 함수에도 접근 지정자를 붙일 수 있다
}

fun main(args:Array<String>)
{
    val rect = Rectangle(3,5)
//    println(rect.width) ==> private
    println(rect.area)
}