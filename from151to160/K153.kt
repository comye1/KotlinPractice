package from151to160

/*
CharSequence 가공하는 확장 함수
 */

fun main()
{
    val str = "  hello "

    println(str.removeRange(0..2))          //ello

    // 앞/뒤를 padChar로 채워서 길이를 length로 만들기
    println(str.padStart(20, '*'))  //************  hello
    println(str.padEnd(17,'&'))     //  hello &&&&&&&&&

    println(str.trimStart())    //hello
    println(str.trimEnd())      //  hello
    println(str.trim())         //hello

    println(str.slice(3..5))       //ell
    println(str.subSequence(3..5))  //ell
    println(str.substring(3..5))    //ell

    println(str.reversed())               // olleh

}