package from121to130.k124

/*
enum 클래스 활용하기 - 모든 enum 클래스는 Enum 클래스를 상속
Enum 클래스
{
    val name:String
    val ordinal:Int // 순서(인덱스)

    fun valueOf(value:String):열거 클래스 //열거 상수 이름 -> 열거 상수 반환
    fun values():Array<열거 클래스> // array로 반환
}
 */

enum class Mode
{
    SELECTION, PEN, SHAPE, ERASER
}

fun main(args:Array<String>)
{
    val shapeMode:Mode = Mode.SHAPE
    println(shapeMode.name)
    println(shapeMode.ordinal)

    val modes:Array<Mode> = Mode.values()
    for(mode:Mode in modes)
        println(mode)

    println(Mode.valueOf("PEN").ordinal)
}
