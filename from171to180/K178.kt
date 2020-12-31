package from171to180

/*
Any?.toString 확장 함수

fun Any?.toString():String = this?.toString() ?:"null"
(엘비스 연산자 - this?.toString()이 null일 때 null 반환)
 */

fun main()
{
    val empty:Int? = null
    val str:String = empty.toString()
    println(str)
}