package from141to150

/*
MutableSet 인터페이스
- mutableSetOf() 호출하여 생성
- MutableCollection<E> 상속
 */

fun main(args:Array<String>)
{
    val set:MutableSet<Int> = mutableSetOf(1,5,6)
    println(set)

    println(set.add(5)) //이미 있어 추가하지 못해 false
    println(set)

    println(set.addAll(listOf(2,5))) //하나라도 추가되기 때문에 true
    println(set)
}