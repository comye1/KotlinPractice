package from1to10

fun main(args:Array<String>):Unit
{
    var total:Int //선언
    total = 0

    var a:Int = 51 + 84 - 13 //선언 및 초기화
    //val은 수정 불가능(final)
    println(a)

    var b:Int = 12 + 39 + a
    println(b)

    total = a + b
    println(total)

    //원시 타입이 없고 기본 타입들도 모두 클래스이다
    //코틀린 컴파일러 - 최적화, 원시 타입을 쓰는 자바 바이트코드 생성
}