package from151to160

import java.lang.StringBuilder

/*
StringBuilder 클래스 - 문자열 덧붙이기

class StringBuilder:CharSEquence, Appendable

interface Appendable
{
    fun append(csq:CharSequence):Appendable
    fun append(csq:CharSequence, start:Int, end:Int):Appendable
    fun append(c:Char):Appendable
}
 */

fun main()
{
    val builder = StringBuilder()
        .append("2020")
        .append("-12")
        .append("-29")

    println(builder)

    val result = builder.toString()
    println(result)
}