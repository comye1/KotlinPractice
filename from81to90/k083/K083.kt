package from81to90.k083

private var num = 23 //이 파일 내에서만 접근 가능

private fun print() = println(num) //이 파일 내에서만 접근 가능

public fun hello(value:Int) //어디에서나 접근 가능
{
    num = value
    print()
}

public class Person(age:Int) //어디에서나 접근 가능
{
    public var age = age //어디에서나 접근 가능(get)
        private set //외부에서 값 변경 불가능

    public val isYoung public get() = age < 30 //어디에서나 접근 가능, get 호출 가능
}