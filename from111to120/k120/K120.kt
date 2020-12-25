package from111to120.k120

/*
배열(Array)

class Array<T>
{
    val size:Int
    operator fun get(index:Int):T //[]로 접근
    operator fun set(index:Int, value:T):Unit //[]로 설정
    operator fun iterator():Iterator<T> //for문에 사용
}
 */
fun main(args:Array<String>)
{
    val integers:Array<Int> = arrayOf(10,20,30,40)

    println(integers.size)
    println(integers[1])

    integers[3] = 15

    for(i in integers)
        print("$i")
}
