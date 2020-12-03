package from71to80

/*
Elvis Operator - null이 아니면 그 값을 사용, null이면 적은 값으로 대체
 */

fun main(args:Array<String>)
{
    val num:Int? = null
    println(num?:0) // null -> 0

    val num2:Int? = 15
    println(num2?:0) // not null -> 15

    /*
    String str;

    return(str!=null)?str : "Hello"

    ==> 이렇게 쓰면 된다
    return str?:"Hello"
     */
}