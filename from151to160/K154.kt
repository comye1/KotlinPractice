package from151to160

/*
CharSequence 쪼개기
 */

fun main()
{
    val hello:CharSequence = "안녕하세요\n감사해요\n잘있어요"
    val date:CharSequence = "2020.12.29"

    println(hello.lines()) //'\n' 기준으로 자르기, List<String> 타입으로 반환
    for(line in hello.lineSequence()) //Sequence<String> 타입으로 반환
        print(line+"/")
    println()
    println(date.split('.'))

}