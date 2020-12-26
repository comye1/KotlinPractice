package from121to130.k121


/*
배열을 가변 인수로 사용하기
 */

fun printAll(vararg tokens:String)
{
    for(token in tokens)
        print("$token ")
}

fun main(args:Array<String>)
{
    val numbers:Array<String> = arrayOf("What's", "your","name?")

    printAll(*numbers) // 배열 앞에 *을 붙이면 가변 인수로 활용할 수 있다.
}