package from61to70

fun main(args:Array<String>)
{
    //in 연산자
    println('o' in "Kotlin") // "Kotlin".contains('o')
    println("li" in "Kotlin") // "Kotlin".conatins("li")
    println("in" !in "Kotlin") // !"Kotlin".contains("in)

    // operator fun contains로 오버로딩 가능
}