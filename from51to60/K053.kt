package from51to60

class AAA
{
    var num = 6

    fun memberFunc(num:Int)
    {
        println(num) // argument num
        println(this.num) // memeber num
    }
}

fun main(args:Array<String>)
{
    val a = AAA()
    a.memberFunc(14) // 14, 6
}