package Demo74;

import java.util.function.Predicate;

/**
 * @Author: hsy
 * @Date: 2022/10/17/19:58
 * @Description: negate����  == ���� !
 */
public class Demo11Predicate_4 {
    public static void main(String[] args) {
        String s1="hello";
        boolean b = method(s1, s -> s.contains("F"));
        boolean b2 = method(s1, s -> s.contains("h"));
        System.out.println(b); //f�����ڷ���false,��ȡ�� ����true
        System.out.println(b2);//h���ڷ���true����ȡ��   ����false
    }
    protected static boolean method(String s, Predicate<String> predicate_1){
        return predicate_1.negate().test(s);
    }
}
