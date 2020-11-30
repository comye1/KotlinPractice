package from61to70

open class CCC
{
    open fun hello() = print("CCC")
}

class DDD:CCC()
{
    override fun hello() = println("DDD")
}

fun main(args:Array<String>)
{
    val one = CCC()
    val two = DDD()
    val three:CCC = two

    one.hello() // CCC
    two.hello() // DDD
    three.hello() // DDD 실제로 참조하는 함수가 호출됨!
}