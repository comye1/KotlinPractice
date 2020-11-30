package from61to70

//Any 클래스. (모든 클래스의 슈퍼 클래스)

/*
open class Any
{
    open operator fun equals(other:Any?):Boolean // == 연산자 오버로딩
    open fun hashCode:Int // 객체 해시코드 반환
    open fun toString:String // 객체 내용을 String 타입으로 변환
}
*/

class Building(val name:String="",
               val date:String="",
               val area:Int=0)
{
    override fun toString() =
                "name : ${this.name}\n" +
                "date : ${this.date}\n" +
                "are : ${this.area}\n"

}

fun main(args:Array<String>)
{
    val building = Building("Eiffel", area=2500)
    printObject(building)
}

fun printObject(any:Any){
    println(any.toString())
}

