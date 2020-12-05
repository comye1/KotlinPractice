package from81to90

/*
Extension Function : 상속 없이 클래스 외부에서 멤버 함수를 추가
기존 멤버 함수와 이름, 시그니처가 동일하면 확장 함수가 가려진다.
 */

fun String.isNumber():Boolean //String 클래스(리시버)에 함수 추가
{
    var i = 0
    while(i<this.length)
    {
        if(!(this[i] in '0'..'9')) //'0' <= this[i] && this[i] <= '9'
            return false
        i++
    }
    return true
}


fun main(args:Array<String>)
{
    //멤버 함수처럼 호출
    println("1234567890".isNumber())
    println("19.99".isNumber())
}