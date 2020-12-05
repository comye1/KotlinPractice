package from81to90.k089

/*
    Companion Object - 클래스 안에 포함되는 이름 없는 객체, 모든 인스턴스가 공유하는 객체

    static 키워드 효과
 */
class Person private constructor() // 생성자 통해 생성 불가
{
    companion object //Person 인스턴스를 생성할때 카운트되도록 하는 객체
    {
        fun create():Person //create를 호출해서 생성
        {
            countCreated += 1
            return Person()
        }

        var countCreated = 0
            private set
    }
}

fun main(args:Array<String>)
{
    val a = Person.create()
    val b = Person.create()
    val c = Person.Companion.create()
    println(Person.countCreated)
}