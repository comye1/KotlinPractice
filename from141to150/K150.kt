package from141to150

/*
CharSequence 인터페이스 - 문자열 관련 클래스의 뼈대 인터 페이스
String, StringBuilder가 구현

CharSequence 멤버
abstract val length:Int
abstract operator fun get(index:Int):Char
abstract fun subSequence(startIndex:Int, endIndex:Int):CharSequence
 */

fun main(args:Array<String>)
{
    val seq:CharSequence = "Hello"
    println(seq.length)
    println(seq[2])
    println(seq.subSequence(1,4))
}