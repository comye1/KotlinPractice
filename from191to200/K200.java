package from191to200;

/*
코틀린의 동반자 객체 - 선언된 객체와 비슷하게 접근한다.
 */

public class K200
{
    public static void main(String[] args)
    {
        KotlinClass3.Companion.setNum(29);
        System.out.println(KotlinClass3.Companion.getNum());
        KotlinClass3.Companion.hello();

        //JvmStatic 어노테이션
        KotlinClass3.hi();
    }
}
