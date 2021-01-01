package from181to190

import kotlin.system.exitProcess

/*
exitProcess - 어디서나 프로그램 종료하기

inline fun exitProcess(status:Int):Nothing

status에 0을 넣어 전달하면 정상 종료, 다른 값을 넣으면 비정상 종료
 */

fun main()
{
    something(-1) //종료
    println("hello") //출력되지 않음
}

fun something(num:Int)
{
    if(num < 0)
        exitProcess(0)
}