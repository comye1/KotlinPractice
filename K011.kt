fun main(args:Array<String>):Unit
{
    var str:String = "Hello"
    println(str)

    str = str + "\nKotlin!"
    println(str)

    println(str[8]) //Char, 't'
    println("Programming"[3]) //Char, 'g'


    val num = 10 * 5 + 3 //Int type
    println(str + num) //String + (Int->String) = String
}