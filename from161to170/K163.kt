package from161to170

import java.util.*

/*
apply 함수
객체 생성과 초기화 코드를 하나로 묶는다.

inline fun<T> T.apply(block:T.()->Unit):T
{
    this.block() //함수 호출
    return this //리시버 반환
}
 */

class Person:Object()
{
    var name:String = ""
    var age:Int = 0
    var money:Int = 0
    fun toSting() = "$name $age $money" //override가 안됨 ???
}

fun main(args:Array<String>)
{
    println(
        Person().apply {
            this.name = "Alan"
            this.money = 70
        }.toSting()
    )

}