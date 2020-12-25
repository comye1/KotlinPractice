package from111to120.k118

/*
반복자(Iterator) 특정 구간 속에 있는 원소를 하나씩 반복적으로 꺼내기 위한 인터페이스

interface Iterator<out T>
{
    operator fun next():T
    operator fun hasNext():Boolean
}
Iterator 내부의 변수를 커서(Cursor)라고 부른다. 커서가 이동하면서 원소를 가리킨다.
*/

fun main(args:Array<String>)
{
    val range:IntRange = 1..3
    val iter:Iterator<Int> = range.iterator()

    println(iter.hasNext()) //true
    println(iter.next())    //1

    println(iter.hasNext()) //true
    println(iter.next())    //2

    println(iter.hasNext()) //true
    println(iter.next())    //3

    println(iter.hasNext()) //false
}