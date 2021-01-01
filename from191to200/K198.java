package from191to200;

/*
자바에서 코틀린 코드 접근하기 - 프로퍼티는 get.. set.. 형태로만 접근 가능
 */

public class K198
{
    public static void main(String[] args)
    {
        KotlinClass2 kotlin = new KotlinClass2();
        kotlin.setNum(17);
        System.out.println(kotlin.getNum());

        //JvmField 어노테이션을 붙이면
        kotlin.num2 = 5;
        System.out.println(kotlin.num2);

        //JvmName 어노테이션
        kotlin.setter(23);
        System.out.println(kotlin.getter()); //num3 출력
    }
}
