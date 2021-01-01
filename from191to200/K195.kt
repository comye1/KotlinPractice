package from191to200

/*
자바 코드 접근하기 - 연산자 오버로딩
 */

fun main()
{
    val java = JavaClass2()

    println(13 in java) //contains 호출 => true
    println(java[13])   // get 호출 => 80
    println(java[28])
    println(java[18])
}