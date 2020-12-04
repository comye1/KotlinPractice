package from81to90

open class AA(protected open val number:Int)
{
    protected open fun hello()
    {
        println("Hello")
    }
}

class BB(number:Int):AA(number)
{
    public override val number:Int //override --> public으로 바꿈
        get() = super.number

    public override fun hello() = super.hello() //override --> public으로 바꿈
}

fun main(args:Array<String>)
{
    val b = BB(14)
    val a:AA = b

//    a -> AA 타입이므로 number에 접근 불가능
//    println(a.number) Cannot access 'number': it is protected in 'AA'
//    a.hello() Cannot access 'hello': it is protected in 'AA'

    println(b.number)
    b.hello()

    /*
    private 인 프로퍼티 또는 함수는 오버라이딩이 불가능 (서브클래스에서 접근 자체가 불가능)
    + open 키워드도 붙일 수 없다
     */
}