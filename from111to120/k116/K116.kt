package from111to120.k116

/*
in / out 키워드

AAA<Int> 타입의 값을 AAA<Any> 타입으로 받을 수 있도록 하는 방법
 */

class AAA<out T> //out 키워드 - 서브 타입을 슈퍼 타입에 대입할 수 있게 된다.

class BBB<in T> // in 키워드 - 슈퍼 타입을 서브 타입에 대입할 수 있게 된다.

fun main(args:Array<String>)
{
    val aaaSub = AAA<Int>()
    val aaaSuper:AAA<Any> = aaaSub //Int 타입을 Any 타입에 대입 (out)

    val bbbSuper = BBB<Any>()
    val bbbSub:BBB<Int> = bbbSuper //Any 타입을 Int 타입에 대입 (in)

    val star:AAA<*> = aaaSub //어떤 타입의 AAA 이든 대입 가능
}