package from91to100.k100

/*
    Inner Class
 */
class Outer(private val value:Int)
{
    fun print()
    {
        println(this.value)
    }

    inner class Inner(private val innerValue:Int)
    {
        fun print()
        {
            this@Outer.print()
            println(this.innerValue + this@Outer.value) // 바깥 클래스의 인스턴스에 접근근
       }
    }
}

fun main(args:Array<String>)
{
    val instance:Outer = Outer(130)
    val innerInstance:Outer.Inner = instance.Inner(50)

    innerInstance.print()
}
