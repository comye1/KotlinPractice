package from161to170

/*
let 확장 함수 - run과 같은 역할을 한다.

inline fun <T,R> T.let(block:(T)->R):R
{
    return block(this)
}
 */

fun main()
{
    val a = 10
    val b = 5

    (a*b - 2*a).let { result:Int->
        if(result > 0)
            println(result)
    }
    //표현식의 결과가 매개변수 result로 들어가 사용된다.
}