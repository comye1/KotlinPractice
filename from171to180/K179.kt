package from171to180

/*
String?.plus 연산자 확장 함수 - null인 String에도 + 사용

operator fun String?.plus(other:Any?):String
{
    return this.toString() + other.toString()
}
 */

fun main()
{
    val nullStr:String? = null
    println(nullStr + "테스트")
}