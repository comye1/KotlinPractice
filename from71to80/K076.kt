package from71to80

/* Safe Call Operator
*
*  참조변수?.프로퍼티
*  참조변수?.멤버함수()
*
*  와 같이 접근
*  참조변수가 null이면 위 표현식의 값도 null
* */

class Building
{
    var name = ""
    var date = ""
    var area = 0

    fun print() // member function
    {
        println("이름: " + this.name)
        println("건축일자: " + this.date)
        println("면적: ${this.area}m^2")
    }
}

fun main(args:Array<String>)
{
    var obj:Building? = null
    obj?.print() //null
    obj?.name = "apartment" //null

    obj = Building()
    obj?.name = "Gochuck Skydome"
    obj?.date = "2015-09-15"
    obj?.area = 29120
    obj?.print()
}