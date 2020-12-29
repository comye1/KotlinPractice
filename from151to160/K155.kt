package from151to160

/*
String 클래스

class String:Comparable<String>, CharSequence
operator fun plus(other:Any?):String

CharSequence와 거의 동일한 기능
 */

fun main()
{
    val one = "Hello"
    val two = "Kotlin"
    val three = "JavaFx"

    println(one + two)
    println(one > two)      // Hello < Kotlin
    println(two > three)    // Kotlin > JavaFx
    //글자수 -> 알파벳 순 비교
}

