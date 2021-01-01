package from181to190

/*
코틀린에서 자바 코드 접근하기
 */

fun main()
{
    val rand:Double = Math.random()// double 타입이 Double 타입으로 변환
    //자바의 Math.random 메서드
    // public static double random()
    println(rand)

    val buffer:StringBuffer = StringBuffer()
    //자바의 StringBuffer 클래스
    buffer.append("Hello, ") //java.lang.String 타입 인수 -> kotlin.String 타입
    buffer.append("world!")
    val result:String = buffer.toString()
    println(result)
}