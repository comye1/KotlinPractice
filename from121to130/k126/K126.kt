package from121to130.k126

fun main(args:Array<String>)
{
    val sample = Sample()

    sample.number = -48     //Sample의 setter 호출 -> OnlyPositive의 setter호출 ==> 0으로 설정됨
    println(sample.number) //Sample의 getter 호출 -> OnlyPositive의 getter호출

    sample.number = 100
    println(sample.number)
}