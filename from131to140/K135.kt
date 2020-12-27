package from131to140

/*
컬렉션 Collection
 - 기본적인 자료구조들을 통칭
 - List : 동적 배열, 연결 리스트
 - Set : 집합, 순서가 없다
 - Map : 연관 배열, 키와 값을 대응

 Collection<E> 상속 List<E> Set<E>
 Map<E>
 */

fun main(args:Array<String>)
{
    // fun<T> listOf(vararg elements:T):List<T>
    val list:Collection<Int> = listOf(10,20,10)
    // fun<T> setOf(vararg elements:T):Set<T>
    val set:Collection<Int> = setOf(1,2,3,2,3)
    // fun<K,V> mapOf(vararg pairs:Pair<K,V>):Map(K,V)
    val map:Map<String, String> = mapOf("Apple" to "사과", "Banana" to "바나나")

    println(list)
    println(set)
    println(map)
    /*
    [10, 20, 10]
    [1, 2, 3]
    {Apple=사과, Banana=바나나}
     */
}