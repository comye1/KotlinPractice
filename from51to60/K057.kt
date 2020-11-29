package from51to60

// Primary Constructor , Secondary Constructor(s)

class Time(val second:Int)
{
    init {
        println("init block-")
    }

    constructor(minute:Int, second:Int):this(minute*60 + second) // 다른 생성자(primary) 호출
    {
        println("secondary 1")
    }

    constructor(hour:Int, minute:Int, second: Int):this(hour*60 + minute, second) // secondary 1
    {
        println("secondary 2")
    }

    init {
        println("another init block")
    }
}

fun main(args:Array<String>)
{
    println("${Time(7,56).second} sec")
    println("${Time(2,25, 16).second} sec")
}