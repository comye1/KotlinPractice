package from151to160

/*
문자열 찾아 바꾸기
 */

fun main() {
    val lyrics = "I love you baby, I need you baby"

    println(lyrics.replace("love", "like", ignoreCase = true))
    println(lyrics.replaceFirst("baby", "babe"))
    println(lyrics.replaceRange(2,6, "hate"))
}