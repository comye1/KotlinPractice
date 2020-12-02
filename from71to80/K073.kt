package from71to80

import java.lang.Exception

fun main(args:Array<String>)
{
    try {
        something()
    }
    catch(e:Exception)
    {
        println(e.message)
    }
}

fun something()
{
    val num1 = 24
    val num2 = 0
    div(num1, num2)
}

fun div(a:Int, b:Int):Int
{
    if(b == 0)
        throw Exception("zero divided")
        // 예외 던지기 - 아래 코드 무시, 호출된 위치로 제어 넘어감
    return a / b
}