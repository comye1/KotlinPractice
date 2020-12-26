package from121to130.k130

/*
Triple 클래스 : 세 변수를 하나로 묶기

data class Triple<out A, out B, out C>(val first:A, val second:B, val third:C):Serializable
 */

fun calculateCircle(radius:Int):Triple<Int,Double,Double> =
    Triple(radius*2, radius*2*3.14, radius*radius*3.14)

fun main(args:Array<String>){
    val (diameter, _, area) = calculateCircle(5)
    println("지름 : $diameter")
    println("넓이 : $area")
}