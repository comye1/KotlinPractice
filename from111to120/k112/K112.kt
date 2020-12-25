package from111to120.k112

/*
타입 매개변수는 is 연산자에 사용할 수 없다.
타입 매개변수 앞에 reified를 붙이면 해당 타입 매개변수를 is 연산자에 사용할 수 있다.
inline으로 선언해야 한다.
 */

inline fun <reified T> check()
{
//    val number = 0
    val number = "string"
    if(number is T)
        println("T는 해당 타입 입니다.")
    else
        println("T는 해당 타입이 아닙니다.")
}

fun main(args:Array<String>)
{
    check<String>()
}