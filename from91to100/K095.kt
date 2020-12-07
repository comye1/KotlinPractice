package from91to100

open class AAA;class BBB: AAA()

// 확장 함수 주입
fun AAA.hello() = println("AAA")
fun BBB.hello() = println("BBB")

fun main(args:Array<String>){
    val test: AAA = BBB()
    test.hello() //AAA의 확장 함수가 호출됨

    /*
        확장 함수는 참조 변수의 타입을 따른다. (멤버 함수는 실제 객체의 타입을 따른다.)
     */
}