package from71to80

/*
Smart Casting
 */

fun main(Args:Array<String>)
{
    val number:Int? = null
    val number2 = 1225

    checkNull(number) //null
    checkNull(number2) //1225
}

fun checkNull(any:Any?)
{
    if(any == null) //null인 경우
    {
        println("null")
        return
    }
    //Not-Null 이므로 ?를 쓰지 않음
    println(any.toString())
}