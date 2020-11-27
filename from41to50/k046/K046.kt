package from41to50.k046

fun main(args:Array<String>)
{
    //Stack은 위에서 아래로 메모리를 사용하지만 Heap은 임의의 위치를 사용한다
    //object 표현식은 힙 영역에 객체를 생성하고 좌표를 갖는다
    //person은 참조 변수로 좌표(참조값)을 저장한다
    val person = object // person => Stack, object(name, age) => Heap
    {
        val name:String = "Jane"
        val age:Int = 18
    }

    println(person.name + ", " + person.age)
}