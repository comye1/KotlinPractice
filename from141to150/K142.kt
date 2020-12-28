package from141to150

/*
MutableList 인터페이스 - MutableCollection 상속
mutableListOF로 객체 생성

abstract fun add(index:Int, element:E):Unit
abstract fun addAll(index:Int, elements:Collection<E>):Boolean //index 위치에 elements 모두 추가
abstract operator fun set(index:Int, element:E):E //[] 연산자, index 위치 원소를 element로 교체, 이전 값 반환
abstract fun removeAt(index:Int):E //index 위치 원소 삭제
 */

fun main(args:Array<String>)
{
    val list:MutableList<Char> = mutableListOf('c','a','z')
    println(list)

    list.add(1, '%')
    println(list)

    list.addAll(0,listOf('L','P'))
    println(list)

    println(list.set(2,'g'))
    println(list)

    println(list.removeAt(3))
    println(list)
}