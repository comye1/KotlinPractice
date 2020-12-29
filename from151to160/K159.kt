package from151to160

/*
toList 확장 함수
- List 타입으로 변환하기

fun <T> 타입.toList():List<T>
 */

fun main()
{
    // 같은 타입으로 이루어져 있어야 한다. Pair(10,"h") 안됨
    val list:List<Int> = Pair(10, 20).toList()
    val list2:List<Double> = Triple(5.2,3.15,6.493).toList()
    println(list)
    println(list2)
}