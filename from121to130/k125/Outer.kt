package from121to130.k125


/*
sealed 클래스 - 자신의 중첩 클래스에서만 상속을 허용하는 클래스
 */

sealed class Outer
{
    class One:Outer()
    class Two:Outer()
    class Three:Outer()
}

class Fifth:Outer()
// sealed 클래스와 같은 파일에 속해 있으면 상속이 가능하다.