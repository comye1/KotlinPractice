package from191to200

/*
코틀린에서 자바 코드 접근하기 - Null 안전성
자바의 참조 타입 -> 느낌표가 붙는다. (null을 허용하기 때문에)
자바의 원시 타입 -> 느낌표 없이 인식됨.
 */

class KotlinClass:JavaInterface
{
    override fun trim(str: String?): String = str?.trim()?:""
}

fun main()
{
    val javaInterface:JavaInterface = KotlinClass()
    println(javaInterface.trim("  hi   "))
}