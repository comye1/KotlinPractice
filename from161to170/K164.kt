package from161to170

/*
also 함수
- 객체 생성 및 초기화를 하나의 표현식으로 압축

fun <T> T.also(block:(T)->Unit):T
{
    block(this)
    return this
}
 */

fun main()
{
    println(
        Person().also {person:Person ->
            person.name = "Alan"
            person.money = 70
        }.toSting()
    )
}