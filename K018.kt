fun main(args:Array<String>):Unit
{
    val a = 15
    val b = 17

    var bool:Boolean = (a-b < a+b) && (a==15) //true && true
    println(bool) //true

    bool = !((a+b) > (a*3) || (b-a) > 0) //!(false || true) = !(true)
    println(bool) //false
}