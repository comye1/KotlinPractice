fun main(args:Array<String>)
{
    var x = 0
    var y = 0

    while(x <= 20)
    {
        y = 0
        while(y <= 20)
        {
            if(x+y == 15 && x-y == 5) //x=10, y=5
                break // y에 대한 while문만 빠져나옴
            y += 1
        }
        x += 1
    }
    //y=21, x=21
    println("x : $x, y : $y")

    x = 0
    y = 0

    outer@ while(x <= 20)
    {
        y = 0
        while(y <= 20)
        {
            if(x+y == 15 && x-y == 5)
                break@outer
            y += 1
        }
        x += 1
    }
    //y=5, x=10
    println("x : $x, y : $y")
}