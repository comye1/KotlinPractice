package from101to110.k105

fun main(args:Array<String>)
{
    // 매개변수가 하나일 때 매개변수 선언을 생략 -> it으로 사용
    val instantFunc:(Int) -> Unit = {
        println("Hello $it")
    }

    instantFunc(22)
}