package from181to190

import java.util.Timer
import kotlin.concurrent.timer

/*
timer 함수 - 주기적으로 함수 실행하기

fun timer(
    name:String = null,
    daemon:Boolean = false,
    initialDelay:Long = 0.toLong(), //초기 지연 시간
    period:Long, //주기
    action:TimerTask.()->Unit //주기마다 실행할 함수
):Timer
 */

fun main()
{
    var i = 1
    val t: Timer = timer(initialDelay=1500, period = 250){
        println(i)
        i += 1
    }

    Thread.sleep(2400)
    t.cancel()
}

