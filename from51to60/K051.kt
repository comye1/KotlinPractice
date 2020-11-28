package from51to60

fun main(args:Array<String>)
{
    var a = "one"
    var b = "one"

    println(a == b) // true
    println(a === b) // 가리키는 객체 true

    //String에 한해 같은 문자열을 저장하면 같은 객체를 가리킴


    b = "on"
    b += "e" // "one"을 새로 생성하여 가리킴

    println(a !== b) // true
    println(a == b) // true

    var c = "one"
    println(a === c) // true

    b = a

    println(a === b) // true

}