package from181to190

/*
synchronized 함수 - 스레드 동기화하기
 */

import kotlin.concurrent.thread

private var obj:Int = 0

private fun objPlus()
{
    for(i in 1..1000)
        synchronized(obj){ //동기화 블록으로 감싼다. obj를 점유한다.
            obj++
        }
}

fun main()
{
    thread { objPlus() }
    objPlus()
    //두 개의 스레드에서 obj 값을 동시에 증가시키고 있다.
    Thread.sleep(100) // 스레드가 종료될때까지 대기한다.
    println(obj) //2000
}