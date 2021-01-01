package from191to200;

/*
코틀린에서 선언된 객체 접근하기
 => 일반적인 클래스로 인식된다. INSTANCE라는 이름의 static 필드로 프로퍼티와 함수에 접근한다.
 */
public class K199
{
    public static void main(String[] args)
    {
        System.out.println(KotlinObject.INSTANCE.getNum());
        KotlinObject.INSTANCE.setNum(0);
        KotlinObject.INSTANCE.hello();

        // JvmName 어노테이션
        System.out.println(KotlinObject.getNum2());
    }
}
