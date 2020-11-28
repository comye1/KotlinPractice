package from51to60

class Size(width:Int, height:Int)
{
    val width = width
    val height:Int
//    val area:Int

    init {
        this.height = height
//        this.area = width * height
    }

    val area:Int

    init {
        area = width * height
    }
}

fun main(args:Array<String>)
{
    val size = Size(10, 50)
    println(size.area)
}