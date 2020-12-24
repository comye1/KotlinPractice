package from101to110.k110

/*
제네릭 - 함수에 타입을 전달한다.
 */
fun <T> toFunction(value:T):()->T = {value}
//T타입의 인수 value를 받아 T 타입의 value를 반환하는 함수

fun main(args:Array<String>)
{
    val func:()->Int = toFunction<Int>(1107)
    //Int타입의 toFunction을 만들어서 func함수에 대입
    println(func()) //1107을 반환
}