package from31to40

fun main(args:Array<String>) //from1to10.from11to20.from21to30.main - 스택에 args가 쌓임
{
    val a = -15 //from1to10.from11to20.from21to30.main - 스택에 a가 쌓임
    val result = absolute(a) //absolute 호출 - 반환, 스택에 result가 쌓임
    println(result)
    //from1to10.from11to20.from21to30.main 함수가 끝나서 스택이 비워짐
}

fun absolute(number:Int):Int //absolute - 스택에 number가 쌓임
{
    return if(number >= 0)
        number
    else -number
    //number가 스택에서 사라짐
}