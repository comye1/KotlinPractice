package from91to100

/*
    const keyword - 변수 이름을 저장된 값(표현식)으로 대체
 */

const val hello = "Hello" + " World!"

object Foo
{
    const val bar = "bar"
        // Getter 커스텀 불가능
}

fun main(args:Array<String>)
{
    println(hello)   //println("Hello World!")
    println(Foo.bar) //println("bar")
    println(hello)   //println("Hello World!")
    println(Foo.bar) //println("bar")
}