package from151to160

/*
run 확장 함수 - 코드 중복 줄이기

inline fun <T,R> T.run(block:T.()->R):R
{
    return this.block()
}
 */

fun main()
{
    val a = 10
    val b = 5

    (a*b - 2*a).run {
        if(this > 0)
            println(this)
    }

    // run 의 리시버는 (a*b - 2*a) 이다.
    // 매개변수로 받음 함수 ({} 내부) 를 바로 호출하고 this는 리시버이다.
    // if(a*b - 2*a > 0) println(a*b - 2*a) 이다.
    // 중복되는 (a*b - 2*a)를 this로 묶은 것이다.
}