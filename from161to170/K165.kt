package from161to170

/*
lazy 함수
- 프로퍼티의 값이 필요한 시점에 계산을 시작하게 한다.

fun <T> lazy(initializer:()->T):Lazy<T>

게으른 초기화의 이점
- 실제로 가지고 있지 않은 데이터를 지금 당장 갖고 있는 것처럼 과장할 수 있다.
 */
class AAA
{
    var num:Int = 0
    val num2 by lazy {num*5}
}

fun main()
{
    val one = AAA()
    println(one.num2) //0 으로 초기화 완료
    one.num = 10
    println(one.num2) //0

    val two = AAA()
    two.num = 4
    println(two.num2) //20
}
