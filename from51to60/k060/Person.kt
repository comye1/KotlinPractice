package from51to60.k060

class Person(var name:String, var birthday:String)
{
    // 인덱스 접근 연산자

    operator  fun get(position:Int):String
    {
        return when(position)
        {
            0 -> name
            1 -> birthday
            else -> "not found"
        }
    }

    operator  fun set(position:Int, value:String)
    {
        when(position)
        {
            0 -> name = value
            1 -> birthday = value
        }
    }
}