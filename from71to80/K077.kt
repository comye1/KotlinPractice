package from71to80

/*
!! 연산자는 Nullable 타입을 Not-null 타입으로 강제로 캐스팅한다.
 */

fun main(args:Array<String>)
{
    var obj:Building? = Building() //Building 타입으로 캐스팅
    obj!!.name = "Gwangmyung Station"
    println(obj!!.name)

    obj = null//Building 타입 캐스팅 -> Null Pointer
//    obj!!.print()  //KotlinNullPointerException
}