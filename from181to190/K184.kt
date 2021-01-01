package from181to190

import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

/*
코드 성능 측정하기
measureTimeMillis
measureNanoTimes
Unit 타입 함수를 매개변수를 받아 실행하여 시간을 측정한다.
 */

fun main()
{
    println(measureTimeMillis {
        var sum = 0L
        for(i in 1..100000000)
            sum += i
    })

    println(measureNanoTime {
        var sum = 0L
        for(i in 1..100000000)
            sum += i
    })
}
