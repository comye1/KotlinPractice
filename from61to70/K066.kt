package from61to70

open class AAA
{
    open fun func() = println("AAA")
}

class BBB:AAA()
{
    override fun func() { //superclass의 func을 오버라이딩
        super.func() //superclass의 func 호출
        println("BBB")
    }
}

/*
override 키워드는 open을 포함한다. -> 서브클래스에서 다시 오버라이딩 할 수 있다.
이를 막으려면 함수 앞에 final 붙이기
 */

fun main(args:Array<String>)
{
    AAA().func()
    BBB().func()
}