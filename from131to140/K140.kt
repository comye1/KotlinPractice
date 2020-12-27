package from131to140

/*
Mutable Collection
코틀린의 컬렉션은 기본적으로 수정이 불가능한다. Thread-safe한 코드를 만들 수 있다. (권장사항)
원소를 추가하거나 삭제하기 위해 MutableCollection
interface MutableCollection<E>:Collection<E>, MutableIterable<E>

interface MutableIterable<out T>:Iterable<T>
{
    override fun iterator():MutableIterator<T>
    //Interable 인터페이스의 iterator 함수를 오버라이드해서 MutableIterator 타입으로 반환
}
멤버
abstract fun add(element:E):Boolean //원소 추가 후 true 반환, 중복되어 추가 못할 시 false
abstract fun addAll(elements:Collection<E>):Boolean //모두 추가되면 true
abstract fun removeAll(elements:Collection<E>):Boolean//하나라도 제거시 true
abstract fun retainAll(elements:Collection<E>):Boolean //일치하는 원소만 남김, 하나라도 제거되면 true
abstract fun clear() //모든 원소 삭제

 */

fun main(args:Array<String>)
{
    val mutableList:MutableCollection<Int> = mutableListOf(1,2,4,2,3,2,5)
    println(mutableList)

    mutableList.add(1)
    println(mutableList)

    mutableList.addAll(listOf(3,2,4))
    println(mutableList)

    mutableList.remove(1)
    println(mutableList)

    mutableList.removeAll(listOf(1,2))
    println(mutableList)

    mutableList.retainAll(listOf(3,5))
    println(mutableList)

    mutableList.clear()
    println(mutableList)
}