package from31to40

fun main(args:Array<String>):Unit
{
    println(cToF(36)) //인수 - argument
    println(getAverage(62, 79))
}

//매개변수(parameter) - val
fun cToF(celsius:Int):Double
{
    return celsius*1.8 + 32
}

fun getAverage(a:Int, b:Int):Double
{
    return (a+b)/2.0
}