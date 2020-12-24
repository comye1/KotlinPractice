package from101to110.k109

fun main(args:Array<String>) {
    //Int 리시버를 [left,right] 범위 이내로 가공하여 반환하는 확장 함수
    val makeSure: Int.(left: Int, right: Int) -> Int
    // 리시버 타입이 Int 매개변수 타입이 (Int,Int) 반환 타입이 Int 인 함수 \

    makeSure = {left:Int, right:Int ->
        if(this<left)left
        else if(this>right) right
        else this
    }

    println(15.makeSure(20,40))
    println(19.makeSure(0,50))
    println(25.makeSure(0,18))
}