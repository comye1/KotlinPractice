package from131to140

/*
List 인터페이스
interface List<out E>:Collection<E>

abstract operator fun get(index:Int):E //[]연산자
abstract fun indexOf(element:E):Int
abstract fun lastIndexOf(element:E):Int //indexOf에서는 일치하는 첫번째 인덱스, 여기서는 마지막 인덱스
abstract listIterator():ListIterator<E> //iterator를 반환
abstract fun listIterator(index:Int):ListIterator<E> //index부터 시작하는 iterator 반환
abstract fun subList(fromIndex:Int, toIndex:Int):List<E> // [fromIndex,toIndex) 리스트 반환
 */

fun main(args:Array<String>)
{
    val list:List<Double> = listOf(20.15, 2.42, 8.47, 4.65, 2.42)

    println(list[0])
    println(list.indexOf(2.42))
    println(list.indexOf(4.65))
    println(list.lastIndexOf(2.42))
    println(list.subList(1,3))
}