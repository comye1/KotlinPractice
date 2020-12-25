package from111to120.k111

fun <T,R> T.map(mapper:(T)->R):R //두 개의 타입 인수 받음. T->R 변환하는 함수 mapper를 받음
{
    return mapper(this) //mapper에 리시버를 넣어 호출한 값을 그대로 반환
}

fun main(args:Array<String>)
{
    val square:Int =
        11.map{
            it*it /////mapper 매개변수
            //11.map<Int,Int>  타입 인수 생략(추론 가능)
        }
    println(square)
}

