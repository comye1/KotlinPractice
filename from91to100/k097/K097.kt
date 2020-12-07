package from91to100.k097

/*
    Interface
 */

interface Printable
{
    fun print():Unit
}

class AAA: Printable // 플러그인 개념 (print 기능 추가)
{
    override fun print() {
        println("Hello")
    }
}

fun print(anything:Printable)
{
    anything.print()
}

fun main(args:Array<String>)
{
    print(AAA())
}
