package from101to110.k108
/*
Closure 클로저 - 지역변수가 소멸하지 않는 것처럼 보이도록 함
만들어질 때의 환경을 기억하는 함수
 */
fun returnFunc(num:Int):() -> Unit = {println(num)}
fun main(args:Array<String>)
{
    val f:()->Unit = returnFunc(30)
    f() //println(num) => 30!! 함수 리터럴이 만들어질 때의 상황을 기억한다.
}