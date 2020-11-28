package from51to60.k052

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

// 코틀린의 모든 타입은 클래스이다. (기본 타입 포함)