package from161to170

/*
with 함수 - this로 표현식 전달

inline fyn <T,R> with(receiver:T, block:T.()->R):R
{
    return receiver.block()
}
 */

fun main(args:Array<String>)
{
    val a = 3; val b = 7
    with(a*b - b*b){
        println(this)
        println(-this)
    }
}