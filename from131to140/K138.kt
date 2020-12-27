package from131to140

/*
ListIterator 인터페이스
Iterator<T> 인터페이스를 구현

abstract fun hasPrevious():Boolean
abstract fun previous():T //커서를 옮김
abstract fun nextIndex():Int
abstract fun previousIndex():Int

 */

private fun moveToNext(iter:ListIterator<Int>)
{
    print("${iter.hasPrevious()}, ")
    print("${iter.hasNext()}, ")
    print("${iter.previousIndex()}, ")
    print("${iter.nextIndex()}, ")
    println("${iter.next()}")
}

fun main(args:Array<String>)
{
    val iter:ListIterator<Int> = listOf(10,20,30).listIterator()

    moveToNext(iter)
    moveToNext(iter)
    moveToNext(iter)
}