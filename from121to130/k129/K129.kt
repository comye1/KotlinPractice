package from121to130.k129

/*
to 확장 함수 : 두 값을 간단히 Pair로 묶기

infix fun <A,B> A.to(that:B):Pair<A,B> = Pair(this,that)
 */

fun main(args:Array<String>)
{
    val test:Pair<Int,Double> = 10 to 3.14 //infix로 선언되어 연산자처럼 사용
}

