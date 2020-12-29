package from151to160

/*
CharSequence 확장 함수 - 접두사 접미사 관련
 */

fun main()
{
    val str:CharSequence = "https://www.naver.com"

    //prefix로 시작하거나 suffix로 끝날 때 true / 아닐 때 false 반환, 대소문자 구분 안 할시 ignoreCase true
    println(str.startsWith("https://",ignoreCase = true)) //true
    println(str.endsWith(".com")) //true

    //prefix로 시작하거나 suffix로 끝나면 이것을 삭제한 문자열 반환
    println(str.removePrefix("https://"))
    println(str.removeSuffix(".com"))

    //prefix로 시작하고 suffix로 끝날 때 이것을 삭제한 문자열 반환
    println(str.removeSurrounding("https://", ".com")) // www.naver
    println(str.removeSurrounding(prefix = "https://", suffix = ".net")) //https://www.naver.com

}