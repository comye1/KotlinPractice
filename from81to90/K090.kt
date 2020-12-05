package from81to90

/*
    inline 함수 - 실행 흐름이 이동하지 않고 함수 body로 대체하여 성능을 저해하지 않음

    그러나 함수가 재활용되지 않기 때문에 프로그램 크기가 커진다.
 */

inline fun hello()
{
    println("Hello")
    println("World")
}

fun main(args:Array<String>)
{
    hello()
    hello()
    /*
    println("Hello")
    println("World")
    println("Hello")
    println("World")
     */
}