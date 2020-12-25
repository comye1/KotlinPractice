package from111to120.k117
/*
.. 연산자 : 범위를 표현한다
 */
fun main(args:Array<String>)
{
    /*
    .. = rangeTo => 오버로딩할 수 있다.
     */
    val oneToTen:IntRange = 1..10 //IntRange타입
    //1..10 = 1.rangeTo(10) 로 컴파일된다. IntRange 값을 반환한다.
    //IntRange 클래스는 contains 연산자를 멤버 함수로 갖고 있어 in 연산자를 사용할 수 있다. Boolean을 반환한다.
    println(5 in oneToTen) //true

    val upperAtoZ:CharRange = 'A'..'Z' //CharRange타입
    //'A'..'Z' = 'A'.rangeTo('Z') 로 컴파일된다. CharRange 값을 반환한다.
    //CharRange 클래스는 contains 연산자를 멤버 함수로 갖고 있어 in 연산자를 사용할 수 있다. Boolean을 반환한다.
    if('C' in upperAtoZ)
        println("대문자입니다.")

    if('p' in 'a'..'z')
        println("소문자입니다.")
}