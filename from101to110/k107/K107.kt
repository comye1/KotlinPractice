package from101to110.k107

/*
고차 함수 (High-order Function) : 함수를 인수로 받거나 함수를 반환하는 함수
 */

fun decorate(task:() -> Unit){ // task라는 함수를 받아서 앞뒤에 작업시작, 작업끝을 출력하고 실행함
    println("=== 작업시작 ===")
    task()
    println("=== 작업 끝 ===")
}

fun diary(month:Int, date:Int, task:() -> Unit) {
    println("$month 월 $date 일")
    task()
}

fun main(args:Array<String>){
    decorate({
        val a = 10; val b = 4
        println("$a + $b = ${a+b}")
    })
    //괄호 생략 가능
    decorate{
        println("some"); println("tasks")
    }

    diary(12,25){ //매개변수가 여러 개일 때 함수를 바깥으로 빼기
        println("오늘은 크리스마스")
    }

}