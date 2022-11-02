package Demo74;


import java.util.function.Predicate;

/**
 * @Author: hsy
 * @Date: 2022/10/17/19:27
 * @Description: ��Ҫ��ĳ���������ͽ����жϣ��Ӷ��õ�һ��booleanֵ����ʱ����ʹ��Prediate�ӿ� test����
 */
public class Demo11Predicate_1 {
    public static void main(String[] args) {
        String s="abcdef";
        boolean b=method01(s,(s1)->{
            //�Դ��ݵ��ַ��������жϣ��ж��ַ����Ƿ����5
            return s1.length()>5;
        });
        System.out.println(b);

        //    �Ż�=========================
        boolean b1 = method01(s, s2 -> s2.length() > 5);

    }

    /**
     * @description
     * @param s:
     * @param predicate:
     * @return boolean
     * @author hsy
     * @date 2022/10/17 19:32
     */
    private static boolean method01(String s, Predicate<String> predicate) {
        return predicate.test(s);
    }
}
