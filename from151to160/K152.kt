package from151to160

/*
CharSequence가 비어있는지 검사하기
 */

fun main()
{
    val emptyStr = ""
    val whiteSpace = " "
    val nullStr:String? = null

    //isEmpty는 ""와 같은 지 비교
    println(emptyStr.isEmpty())
    println(whiteSpace.isEmpty()) // false

    //isBlank는 isEmpty이거나 공백 문자로 이루어졌는지 비교
    println(emptyStr.isBlank())
    println(whiteSpace.isBlank())

    //isNullOrEmpty는 null이거나 isEmpty인지
    println(nullStr.isNullOrEmpty())
    //isNullOrBlank는 null이거나 공백 문자로 이루어져있는지
    println(nullStr.isNullOrBlank())

    //아래 모두 true
    println(emptyStr.isNullOrBlank())
    println("    ".isNullOrBlank())
    println("".isNullOrBlank())
    println("\n".isNullOrBlank())
    println("\t".isNullOrBlank())
    println("\n\t".isNullOrBlank())

}