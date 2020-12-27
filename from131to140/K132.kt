package from131to140

/*
ClosedRange 인터페이스 - 닫힌 구간을 표현
interface ClosedRange<T:Comparable<T>> {
    val start:T
    val endInclusive:T
    //value가 구간에 속하는지
    operator fun contains(value:T):Boolean = value >= start && value <= endInclusive
    //구간이 비어있는지
    fun isEmpty():Boolean = start > endInclusive
}
 */

fun main(args:Array<String>)
{
    val intRange:IntRange = 1..10
    val longRange:LongRange = 1L..100L //실수 Range는 for문 in 연산자에 사용 불가능
    val charRange:CharRange = 'A'..'Z'

    println(intRange.start)
    println(longRange.endInclusive)
    println('*' in charRange)
    println(charRange.isEmpty())
}