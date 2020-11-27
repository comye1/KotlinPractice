package from41to50

fun main(args:Array<String>)
{
    var result = ""
    var i = 1

    while(i <= 100)
    {
        result += "$i"
        i += 1

        //1에서 100까지 문자열을 연결한다
        // => 힙에 미아 객체가 수백 개 존재
        // => 가비지 컬렉션이 자동으로 쓰레기 객체를 삭제한다.
    }

    println(result)
}