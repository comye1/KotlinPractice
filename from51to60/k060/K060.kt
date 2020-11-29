package from51to60.k060

fun main(args:Array<String>)
{
    val person = Person("Amy", "1997-01-25")
    println(person[0])
    println(person[1])
    println(person[-1])

    person[0] = "Mary" // person.set(0, "Mary")
    println(person.name)
}