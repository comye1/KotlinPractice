package from171to180

/*
Double 값 검증하기
NaN 또는 Infinite
 */

fun main()
{
    val a:Double = 0.0/0.0
    val b:Double = 7/0.0
    val c:Double = 3.2

    println("$a")
    println(a.isNaN())

    println("$b")
    println(b.isInfinite())

    println("$c")
    println(c.isFinite())
}

