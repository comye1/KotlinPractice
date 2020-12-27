package from131to140

/*
Iterable 인터페이스 - 클래스가 반복자를 지원하도록

interface Iterable <out T>
{
    operator fun iterator():Iterator<T>
}
 */

/*
IntRange -> IntProgression, ClosedRange 구현
IntProgression -> Iterable<Int>를 상속 ==> IntRange 인스턴스를 for문의 in 연산자에 사용이 가능

open class IntProgression
{
    val first:Int
    val last:Int
    // 큰 수에서 작은 수로 진행할 수도 있다.
    val step:Int
}
 */

fun main(args:Array<String>)
{
    val prog:IntProgression = 2..7
    println(prog.first)
    println(prog.last)
    println(prog.step)

    for(i in prog)
        print("$i ")
}