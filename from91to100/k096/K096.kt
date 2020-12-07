package from91to100.k096

/*
    추상 클래스 - 인스턴스화되지 않고 여러 서브 클래스를 묶는 용도로 사용하는 클래스
 */

abstract class Person // open 키워드는 포함된다.
{
    abstract fun getSalary():Int //추상 메서드
    // 일반 클래스로 상속할 때까지 오버라이딩 불필요
}

class Student(private val tuition:Int) : Person()
{
    override fun getSalary() = -tuition
}

class Professor(private val classCount:Int) : Person()
{
    override fun getSalary() = classCount * 200
}

class Employee(private val initial:Int, private val years:Int) : Person()
{
    override fun getSalary() = initial * (1.0 + years / 10.0).toInt()
}

fun getFinance(vararg persons:Person) : Int
{
    var i = 0
    var finance = 0
    while(i <persons.size)
    {
        finance -= persons[i].getSalary()
        i += 1
    }

    return finance
}

fun main(args:Array<String>)
{
    val finance = getFinance(Student(280), Student(350),
        Professor(5), Professor(2), Employee(250, 3))

    println("재정 : $finance")
}