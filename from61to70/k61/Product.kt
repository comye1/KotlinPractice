package from61to70.k61

class Product(val id:Int, val name:String)
{
    operator fun invoke(value:Int)//호출 연산자 오버로딩
    {
        println(value)
        println("id:$id\nname:$name")
    }
}