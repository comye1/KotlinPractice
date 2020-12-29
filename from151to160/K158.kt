package from151to160

/*
Regex 클래스 - 정규식 다루기

constructor(pattern:String) //정규식 문자열을 받는 생성자
infix fun matches(input:CharSequence):Boolean //input이 정규식에 매칭되는지
fun replace(input:CharSequence, replacement:String):String //input 중 정규식에 매칭되는 부분을 replace로 바꿈
 */

fun main()
{
    val regex = Regex("[0-9]+")
    val str = "5243251"
    val str2 = "877 5424 3214"

    println(regex matches str)  //true
    println(regex matches str2) //false
    println(regex.replace(str2, "숫자"))  //숫자 숫자 숫자
}