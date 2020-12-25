package from111to120.k113

/*
클래스와 인터페이스에서 제네릭 사용하기
 */

class Pair<A,B>(val first:A, val second:B) //이름 옆에 식별자 붙이기
{
    override fun toString() = "$first\n$second"
}

fun main(args:Array<String>)
{
    val pair:Pair<Int,Double>
    pair = Pair<Int,Double>(14,8.1) //<Int,Double>타입의 Pair 생성자 호출
    println(pair.toString())

    val pair2:Pair<Int,Int>
    pair2 = Pair(5,1) //<Int,Int>타입이 추론됨
    println(pair2.toString())
}