package from51to60.k058

class Person
{
    var age:Int = 0
//    get()
//    {
//        return field
//    }
     get() = field + 1

    set(value)
    {
        field = if(value>=0) value else 0
    }
    // getter & setter => 값 저장하거나 읽을 때 호출됨!
    // val 의 경우 getter만 정의 가능
}