package Demo74;

import java.util.function.Predicate;

/**
 * @Author: hsy
 * @Date: 2022/10/17/19:52
 * @Description:    or���� ==  ||
 */
public class Demo11Predicate_3 {
    public static void main(String[] args) {
        String tmp="hello_world";
        boolean b = method01(tmp, s -> s.contains("a"), s -> s.length() < 20);
        System.out.println(b);   //true
    }
    protected static boolean method01(String s, Predicate<String> predicate_1,Predicate<String> predicate_2){
        //ʹ�� �߼���
//        return predicate_1.test(s) || predicate_2.test(s);

        //ʹ��or����
        return predicate_1.or(predicate_2).test(s);
    }
}
