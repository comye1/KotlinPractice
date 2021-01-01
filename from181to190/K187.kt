package from181to190

import kotlin.concurrent.thread

/*
thread 함수 : 스레드 생성하기
(JVM의 스레드를 생성하여 JVM에 의존성이 생긴다.)
 */

/*
fun thread(
    start:Boolean=true, //스레드의 생성과 동시에 실행
    isDaemon:Boolean=false, //데몬 스레드로 만들 것인지
    contextClassLoader:ClassLoader?=null,
    name:String?=null,
    priority:Int=-1,
    block:()->Unit
):Thread
 */

fun main()
{
    thread(start=true){
        print("Hello, ")
        Thread.sleep(1000)
        println("World!")
    }

    Thread.sleep(500)
    print("Kotlin ")

    // 바로 "Hello, "
    // 0.5초 "Kotlin "
    // 1초 "World!"
}