package from21to30

fun main(args:Array<String>):Unit
{
    val value:Int = if(7>5)
    {
        println("7은 5보다 크다")
        7 //value = 7
    }
    else
    {
        println("7은 5보다 크지 않다.")
        5
    }

    println(value)
}