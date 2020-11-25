fun main(args:Array<String>):Unit
{
    val score = 78

    if(score >= 90) //false
    {
        println("A")
    }
    else
    {
        if(score >= 80) //false
        {
            println("B")
        }
        else if(score >= 70) // true
        {
            println('C')
        }
        else //score < 70
        {
            println('F')
        }
    }
}