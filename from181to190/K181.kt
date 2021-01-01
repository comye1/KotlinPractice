package from181to190

/*
인수 Argument 유효성 검증하기
check, require 함수로 조건을 검사하고 예외를 던진다.
 */

fun func(num:Int?)
{
    checkNotNull(num) //num이 null이면 IllegalStateException을 던진다.
    //null이 아니면 Non-null 타입으로 캐스팅하여 반환한다.
    check(num!!>=0) //표현식이 false이면 IllegalStateException을 던진다.
}

fun func2(num:Double?)
{
    requireNotNull(num) //num이 null이면 IllegalStateException을 던진다.
    //null이 아니면 Non-null 타입으로 캐스팅하여 반환한다.
    require(num!!.isNaN()) //표현식이 false이면 IllegalStateException을 던진다.
}

fun main(args:Array<String>)
{
    func(10)
    func2(0.0/0.0)
}