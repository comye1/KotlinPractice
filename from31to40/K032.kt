package from31to40

fun main(args:Array<String>):Unit
{
    celsiusToFah(17)
    printHi("Mom")
}
fun celsiusToFah(celsius:Int):Unit //반환하지 않는 함수 - return만 쓰거나 생략
{
    println(celsius*1.8 + 32)
}
fun printHi(name:String) = println("Hi, " + name)