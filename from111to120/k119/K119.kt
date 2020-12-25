package from111to120.k119

/*
반복문 for : 코틀린은 for-each 스타일만 지원한다.
 */

fun main(args:Array<String>)
{
    for(i:Int in 1..10)
        print("$i")
    println()

    for(i:Int in 1..10)
    {
        if(i>5)
            break

        print("$i")
    }
    /*
    다음과 같은 꼴로 컴파일러가 최적화한다.
    for(i=1; i<=10; ++1)
        println("$i");
     */
}
