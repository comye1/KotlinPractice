package from21to30

fun main(args:Array<String>)
{
    var i = 0
    while(i < 10)
    {
        i += 1
        if(i%2 == 0)
            continue // even number -> do not print!
        println(i)
    }
}