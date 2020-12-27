package from131to140

/*
Collection 인터페이스

interface Collection<out E>:Iterable<E> //iterator()함수 주입

멤버 함수
abstract val size:Int
abstract fun isEmpty():Boolean
abstract operator fun contains(element:E):Boolean
abstract fun containsAll(elements:Collection<E>):Boolean
abstract fun iterator():Iterator:Iterator<E>
 */
fun main(args:Array<String>)
{
    val list:Collection<Int> = listOf(19, 1, 1, 4)

    println(list.size)
    println(list.isEmpty())
    println(19 in list)

    for(i:Int in list)
        print("$i ")
}