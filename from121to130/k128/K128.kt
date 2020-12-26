package from121to130.k128

/*
Pair 클래스 - 두 변수를 하나로 묶기

data class Pair<out A, out B>(val first:A, val second:B):Serializable
 */

//a,b의 몫과 나머지를 반환
fun divide(a:Int, b:Int):Pair<Int,Int> = Pair(a/b, a%b) // ==> 두 값을 반환할 수 있음

fun main(args:Array<String>){
    val(q,r) = divide(10,3) //Pair 객체로 받아서 두 변수로 분해
    println("몫 : $q")
    println("나머지 : $r")
}