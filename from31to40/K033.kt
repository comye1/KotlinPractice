fun main(args:Array<String>)
{
    println(getAverage(36,25))
    getAverage(20,52,true)
    println(getAverage(90))
    getAverage(66, print=true) //이름 지정 - 항상 오른쪽에!
    getAverage(print=true)
    getAverage(print=true, a=54, b=16) //이름 지정 - 순서 바뀌어도 됨
}

fun getAverage(a:Int=0, b:Int=0, print:Boolean=false):Double
{
    val result = (a+b)/2.0
    if(print)
        println(result)
    return result
}