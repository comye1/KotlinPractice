package from121to130.k123

/*
ENUM 클래스에 프로퍼티와 멤버 함수 선언하기
생성자가 있으면 enum 상수 각각에 인수를 적어 생성자를 호출해야 한다.
 */
enum class Mode(val number:Int)
{
    SELECTION(0),
    PEN(1),
    SHAPE(2),
    ERASER(3); //enum 상수 생성자 호출 => 인스턴스 생성

    fun printNumber()
    {
        println("모드 : $number")
    }
}

fun main(args:Array<String>)
{
    val mode:Mode = Mode.ERASER

    println(mode.number)
    mode.printNumber()
}