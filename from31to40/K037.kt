package from31to40

var a = 5

fun main()
{
    val a = 30
    println(a) //30

    func()
}

fun func()
{
    println(a) //전역변수 a = 5
}