package from71to80

import java.lang.NumberFormatException

fun main(args:Array<String>)
{
    try{
        val str = "abcd"
        val num = str.toInt()

        println(num)
    }
    catch(e : NumberFormatException) {
        println("문자열을 숫자로 변경할 수 없음")
    } // catch 블록을 여러 개 만들면 여러 종류의 예외를 처리할 수 있다.
    finally {
        println("프로그램 종료")
    }
}