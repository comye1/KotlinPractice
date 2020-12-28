package from141to150

/*
MutableIterator 인터페이스

public interface Mutable<out T>:Iterator<T>
{
    public fun remove():Unit
}
*/

fun main(args:Array<String>)
{
    val list = mutableListOf(1,2,3)
    val iter:MutableIterator<Int> = list.iterator()

    println(list)

    iter.next(); iter.remove() //가리키는 원소를 삭제한다.
    println(list)

    iter.next();iter.remove()
    println(list)
}