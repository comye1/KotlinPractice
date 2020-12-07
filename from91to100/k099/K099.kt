package from91to100.k099

class Outer
{
    class Nested
    {
        fun hello() = println("nested class")
    }
}

fun main(args:Array<String>)
{
    val instance:Outer.Nested = Outer.Nested()
    // 식별자만 속해있고, 다른 장소에 있다. 중첩된 클래스가 바깥 클래스의 프로퍼티나 함수에 접근할 수 없다.
    instance.hello()
}