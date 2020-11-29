package from51to60.k059

import javax.swing.plaf.metal.OceanTheme

class Point (var x:Int = 0, var y:Int = 0)
{
    operator fun plus(other:Point):Point
    {
        return Point(x + other.x, y + other.y)
    }
    //p1 + p2 ==> p1.plus(p2)

    operator fun minus(other:Point):Point
    {
        return Point(x - other.x, y - other.y)
    }

    operator fun times(number:Int):Point
    {
        return Point(x * number, y * number)
    }

    operator fun div(number:Int):Point
    {
        return Point(x / number, y / number)
    }

    fun print()
    {
        println("x : $x, y : $y")
    }
}