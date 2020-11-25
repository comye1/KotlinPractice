fun main(args:Array<String>)
{
    println(myFunction())
    println(myFunction()+10)

    println(function())
    println(function2())
}
fun myFunction():Int
{
    val a = 3
    val b = 6

    println("a: " + a + ",b : "+ b)
    return a + b
}

fun function():Double = 2.5 + 4 //블록 및 리턴 생략
fun function2() = 3 * 6 //반환 타입 생략