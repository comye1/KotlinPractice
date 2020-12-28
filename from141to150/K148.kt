package from141to150

/*
컬렉션 중 원하는 원소 걸러내기
(T) -> Boolean ㅅ타입의 함수를 인수를 받음
 */

fun main(args:Array<String>)
{
    val to50 = 1..50

    println(to50.filter{it%4==0})
    println(to50.filterNot{it%4==0})
    println(to50.filterNotNull()) //null이 아닌 원소만 걸러냄
    println(to50.filterIndexed{index, element -> element > 20}) //매개변수 index
    println(to50.filterIsInstance<Long>())//타입에 맞는 원소만 걸러냄
}