package from31to40

var count = 0 //전역 변수

fun main(args:Array<String>)
{
    val a = 15 //지역 변수
    println(a) //15

    count += 1 // count = 1
    printCount() //1, count = 2
    println(count) //2
}

fun printCount()
{
    println(count)
    count += 1
}