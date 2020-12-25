package from111to120.k115

/*
특정 타입을 상속,구현하는 타입만 인수로 받기
 */

interface ValueContainer
{
    fun getValue():Int
}

class AAA:ValueContainer
{
    override fun getValue(): Int = 1102
}

class BBB:ValueContainer
{
    override fun getValue(): Int = 127
}

fun <T:ValueContainer> T.printValue() //ValueContainer를 구현한 타입만 T로 받는다
{
    println(this.getValue())
}

fun main(args:Array<String>)
{
    AAA().printValue()
    BBB().printValue()
}