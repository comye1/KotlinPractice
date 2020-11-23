fun main(args:Array<String>):Unit
{
    var ch:Char = 'A'
    println(ch)

    ch = '\uAC00'
    println(ch)

    ch = 'h'
    println(ch.toInt());
    //유니코드 저장(16진수, 4자리)
}