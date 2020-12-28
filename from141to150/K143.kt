package from141to150

/*
MutableListIterator 인터페이스
- ListIterator, MutableIterator 구현
abstract fun set(element:T):Unit //커서 위치에 교체
abstract fun add(element:T):Unit //커서 위치에 추가
 */

fun main(args:Array<String>)
{
    val list = mutableListOf(1,2,3)
    val iter:MutableListIterator<Int> = list.listIterator()

    println(list)

    iter.next(); iter.next()
    iter.add(8)
    println(list)

    iter.next(); iter.set(10)
    println(list)
}