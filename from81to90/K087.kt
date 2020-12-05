package from81to90

/*
Extention Property
- Field가 존재하지 않는다.
 */

val String.isLarge:Boolean
    get() = this.length >= 10

fun main(args:Array<String>)
{
    println("happy".isLarge)
    println("You are so great".isLarge)
}