package from91to100

/*
    Nullable Receiver - 확장 함수를 통해 null을 참조하는 변수도 함수 호출이 가능함
 */
fun String?.isNumber() //Nullable Receiver
{
    if(this == null)
        println("String is null")
}

fun main(args:Array<String>)
{
    val empty:String? = null
    empty.isNumber()
}