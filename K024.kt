fun main(args:Array<String>)
{
    val score = 82

    val grade:Char = when(score/10)
    {
        6 -> 'D'
        7 -> 'C'
        8 -> 'B'
        9, 10 -> 'A'
        else -> 'F'
    }

    val grade2:Char = when
    {
        score >= 90 -> 'A'
        score >= 80 -> 'B'
        score >= 70 -> 'C'
        score >= 60 -> 'D'
        else -> 'F'
    }

    println(grade)
    println(grade2)
}