package from61to70

open class AA
{
    open var number = 10
    get() {
        println("AA number Getter")
        return field
    }
    set(value){
        println("AA number Setter")
        field = value
    }
}

class BB:AA()
{
    override var number: Int // property overriding
        get()
        {
            println("BB number Getter")
            return super.number
        }
        set(value)
        {
            println("BB number Setter")
            super.number = value
        }
}

fun main(args:Array<String>)
{
    val test = BB()
    test.number = 6 // Setter
    test.number // Getter
}

open class Pclass(open val number:Int = 0)

class Cclass:Pclass()
{
    override var number:Int = 0 //val -> var override
    get() = super.number
    set //default Setter
}