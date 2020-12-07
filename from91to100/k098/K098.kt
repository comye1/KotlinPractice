package from91to100.k098

/*
    Diamond Problem
 */
interface Parent {fun follow():Unit}

interface Mother:Parent
{
    override fun follow() = println("follow his mother")
}

interface Father:Parent
{
    override fun follow() = println("follow his fater")
}

class Child:Mother, Father
{
    override fun follow()
    {
        println("A child decided to ")
        super<Mother>.follow()
    }
}

fun main(args:Array<String>)
{
    Child().follow()
}