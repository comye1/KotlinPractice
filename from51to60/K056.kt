package from51to60

class Car(val name:String, val speed:Int = 0)
//매개변수에 val/var 키워드 - 프로퍼티 선언 및 초기화

fun main(args:Array<String>)
{
    val car = Car("Ray")
    println(car.name) // "Ray"
    println(car.speed) // 0
}