package from131to140

/*
Map 인터페이스
interface Map<K, out V>
멤버
interface Entry<out K, out V>
abstract val size:Int
abstract val keys:Set<K> //Key는 중복되지 않으므로 Set
abstract val values:Collection<V>  //Value는 중복될 수 있으므로 Collection
abstract val entries:Set<Map.Entry<K,V>> //모든 (key, value) 쌍

abstract fun isEmpty():Boolean
abstract fun containsKey(key:K):Boolean
abstract fun containsValue(value:V):Boolean
abstract operator fun get(key:K):V? //null을 반환할 수 있도록, []연산자
open fun getOrDefault(key:K, defaultValue:V):V //key에 해당하는 값이 없을 때 defaultValue를 반환

 */

fun main(args:Array<String>)
{
    val map:Map<String, String> = mapOf("Apple" to "사과", "Banana" to "바나나")

    println(map.size)
    println(map.keys)
    println(map.values)
    println(map.entries)
    println(map.isEmpty())
    println(map.containsKey("Cocoa"))
    println(map.containsValue("바나나"))
    println(map["Apple"])
    println(map.getOrDefault("Cocoa", "코코아"))
}