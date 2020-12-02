package from71to80

fun main(args:Array<String>)
{
    val str = "abcd"
    val num = str.toInt() // 예외 발생
    // NumberFormatException: For input string: "abcd"

    println(num)
}