package from191to200

/*
SAM 변환 (Runnable, Comparable 등)
 */

fun main()
{
    val runnable:Runnable = Runnable { println("SAM") } //인터페이스 바로 구현
    runnable.run()
}