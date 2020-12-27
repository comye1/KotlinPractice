package from131to140
/*
Progression과 관련된 함수
 */
fun IntProgression.print()
{
    print("first : ${this.first}, ")
    print("last : ${this.last}, ")
    println("step : ${this.step}")

    for(i in this)
        print("$i ")
    println("\n")
}

fun main(args:Array<String>)
{
    val prog:IntProgression = 7 downTo 3
    prog.print()

    val prog2:IntProgression = (3..7).reversed() //7..3으로 적으면 empty로 인식된다.
    println(prog == prog2) // true
    prog2.print()

    val prog3:IntProgression = (1..10) step 3 // 1..10 에서 step만 바꿔준다.
    prog3.print()

    val prog4:IntProgression = 10 downTo 2 step 3 //step 인수는 항상 양수여야 한다.
    prog4.print()

    val prog5:IntProgression = 2 until 5 //[2, 5)
    prog5.print()

    val prog6:IntProgression = (1..10 step 2).reversed()
    prog6.print()
    /*
    first : 9, last : 1, step : -2
    9 7 5 3 1
     */
}