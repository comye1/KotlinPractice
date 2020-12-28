package from141to150

/*
MutableMap 인터페이스
- mutableMapOf 함수 호출하여 생성
- Map<K,V> 상속

interface MutableEntry<K,V>:Map.Entry<K,V>
{
    fun setValue(newValue:V):V
}

override val keys:MutableSet<K>
override val values:MutableCollection<V>
override val entries:MutableSet<MutableMap.MutableEntry<K,V>>
abstract fun put(key:K, value:V):V? //key에 value를 설정하고 원래 값 반환 or null 반환
abstract fun remove(key:K):V? //삭제된 값 반환 or null 반환
abstract fun remove(key:K, value:V):Boolean //key와 value가 일치하는 쌍을 삭제, true or false
abstract fun putAll(from:Map<out K,V>):Unit
abstract fun clear():Unit

inline operator fun<K,V> MutableMap<K,V>.set(key:K, value:V):Unit
{
    put(key,value)
} // map[key] = value 로 값 설정
 */

fun main(args:Array<String>)
{
    val map:MutableMap<String, String> = mutableMapOf()
    println(map)

    println(map.put("Good morning", "Guten Morgen"))
    println(map)

    println(map.put("Good morning", "좋은 아침"))
    println(map)

    map["Good morning"] = "Bonjour"
    println(map)

    map.putAll(mapOf("Blue" to "파랑", "Red" to "빨강"))
    println(map)

    println(map.remove("Blue"))
    println(map)

    println(map.remove("Red", "빨"))
    println(map)

    println(map.remove("Red", "빨강"))
    println(map)

    map.clear()
    println(map)
}