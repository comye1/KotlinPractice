package from81to90

/*
private - 서브클래스에서 직접 접근 불가능
protected - 서브크래스에서 직접 접근 가능
 */

open class AAA(protected val number:Int)

class BBB(number:Int):AAA(number)
{
    // number 접근 가능
    fun printNumber()
    {
        println(number)
    }
}

fun main(args:Array<String>)
{
    val test = BBB(53)
//    println(test.number)
    test.printNumber()
}