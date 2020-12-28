package from141to150

/*
컬렉션 원소 타입 변환하기 Collection<T> --> Collection<R>

map 계열의 확장 함수를 이용해 변환
(T) -> R 타입의 변환 함수를 인수로 받음
 */

fun main(args:Array<String>)
{
    val origin = listOf(65,66,67,68,69)

    println(origin.map{it.toChar()})

    println(origin.mapIndexed{index, element ->
        println("{$index}:$element")
        element.toChar()
    })


    val to100 = 1..100
    println(to100.mapNotNull {
        if(it % 3 == 0) it
        else null
    }) //변환 함수가 null을 반환하면 결과에서 제외
}