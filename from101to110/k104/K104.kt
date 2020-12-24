package from101to110.k104

fun main(args:Array<String>){
    //익명 함수 - return 가능
    val instantFunc:(Int) -> Unit = fun(number:Int):Unit
    {
        println("Hello $number")
    }

    instantFunc(33)
    instantFunc.invoke(33)
}
