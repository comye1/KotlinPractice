package from41to50

//Byte, Short, Int, Long, Float, Double, Char, Boolean 타입을 제외하면 모두 참조 타입!

fun main(args:Array<String>)
{
    var first = "Hello" // Hello를 저장하는 힙 공간을 가리킴
    var second = "World"// World를 저장하는 힙 공간을 가리킴
    first += second // 힙 공간에 Hello World를 새로 생성하여 가리킴

    //힙 영역이 낭비되는 문제가 발생한다!

    println(first)
}