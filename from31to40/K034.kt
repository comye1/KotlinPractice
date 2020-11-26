package from31to40

fun main(args:Array<String>)
{
    println(getSumOf(1, 2, 3, 4, 5))
    println(getSumOf(14, 36, 41))
    println(getSumOf())
}

fun getSumOf(vararg numbers:Int):Int // 가변 인수
{
    val count = numbers.size;
    var i = 0; var sum = 0

    while(i < count){
        sum += numbers[i]
        i += 1
    }
    return sum // 인수가 없어도 0을 리턴
}
//fun function(something:Char, vararg numbers:Int):Int