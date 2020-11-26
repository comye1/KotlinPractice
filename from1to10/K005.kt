package from1to10

fun main(args:Array<String>):Unit
{
    var num:Int = 28 - 6 * 4 //곱셈-정수, 뺄셈-정수
    var num2:Int = 73 % 7 //나눗셈-정수
    var num3:Double = 14.5 / 5 + 1.1 //나눗셈-실수, 덧셈-실수
    var num4:Double = num / num2 + 5.2 //나눗셈-정수, 덧셈-실수

    println(num)
    println(num2)
    println(num3)
    println(num4)

    var dNum:Double = 15 - 3.0 // 15 - 3 오류
    println(dNum)
    dNum = num.toDouble() + 1 // 5.0
    println(dNum)
}