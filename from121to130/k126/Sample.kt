package from121to130.k126

/*
위임된 프로퍼티

Getter/SEtter 구현을 다른 객체에 맡긴다.
 */

class Sample
{
    var number:Int by OnlyPositive() //OnlyPositive의 getValue와 setValue로 대체
}