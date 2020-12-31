package from171to180

/*
toBits, toRawBits 확장 함수
- 이진수 배열로 나타내기
 */

fun main()
{
    val normal = 10.0
    val infinite = 10.0/0
    val nan = 0.0/0

    println(normal.toBits().toString(2))
    println(infinite.toBits().toString(2))
    println(nan.toBits().toString(2))

    println(normal.toRawBits().toString(2))
    println(infinite.toRawBits().toString(2))
    println(nan.toRawBits().toString(2))

    //toString에 정수 인수를 넘기면 그 수를 기수로 하여 문자열을 생성한다.
}