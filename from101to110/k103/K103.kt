package from101to110.k103

/*
함수 리터럴
람다식 {매개변수 -> 반환 값}
 */

fun main(args:Array<String>)
{
    val instantFunc:(Int)->Unit //(Int)->Unit 함수 타입
    instantFunc = {number:Int ->
        println("Hello $number") //함수 리터럴
    }

    instantFunc(33)
    instantFunc.invoke(33) // 멤버 함수 invoke를 통해 호출
    // 변수가 Nullable일 때 instantFunc?.invoke(33)으로 처리
}