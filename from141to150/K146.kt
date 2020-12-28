package from141to150

/*
Sequence 인터페이스
List와 달리 데이터를 게으르게 계산한다. (필요한 순간에 계산을 시작한다.(
-> 무한대의 데이터를 다룰 수 있다.

크기가 정해져 있지 않다. size, length 같은 프로퍼티가 없다.
interface Sequence<out T>
{
    operator fun iterator():Iterator<T>
}

 */
fun main(args:Array<String>)
{
    val seq:Sequence<Int> = sequenceOf(1,2,3)

    for(i in seq)
        print("$i")
}
