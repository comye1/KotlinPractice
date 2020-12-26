package from121to130.k125


//class Four:Outer() //it is private in 'Outer'

fun main(args:Array<String>) {
    val instance: Outer = Outer.Three()

    val text: String = when(instance)
    {
        is Outer.One -> "첫 번째"
        is Outer.Two -> "두 번째"
        is Outer.Three -> "세 번째"
        is Fifth -> "다섯 번째"
    }
    println(text)
}
