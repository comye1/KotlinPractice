package from71to80

fun throwing():Nothing = throw Exception()
// throw Excepton() 표현식의 타입은 Nothing
// Nothing 타입은 모든 타입과 호환됨

fun main(args:Array<String>)
{
    println("start")
    val i:Int = throwing()
    println(i)

//    validate(-5) => Exception 발생

}

fun validate(num:Int)
{
    val result:Int =
        if(num >= 0) num
        else throw java.lang.Exception("num < 0")
}