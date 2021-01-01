package from191to200

/*
자바 코드 접근하기 - 클래스 접근
 */

fun main()
{
    val number:Int = 27
    val str:String = "2021년"

    //인스턴스 뒤에 ::class.jav를 적으면 자바와 호환되는 Class<T> 타입의 객체를 가져온다.
    JavaClass3.printClassInfo(number::class.java)
    JavaClass3.printClassInfo(str::class.java)
    JavaClass3.printClassInfo(Double::class.java)
}