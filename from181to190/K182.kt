package from181to190

/*
KotlinVersion클래스 - 코틀린 버전 알아내기
 */

fun main()
{
    val kotlinVersion:KotlinVersion = KotlinVersion.CURRENT
    println("${kotlinVersion.major}.${kotlinVersion.minor}.${kotlinVersion.patch}")
    println(kotlinVersion.isAtLeast(1,1,0))
}