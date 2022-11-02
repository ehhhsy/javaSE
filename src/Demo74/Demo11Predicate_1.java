package Demo74;


import java.util.function.Predicate;

/**
 * @Author: hsy
 * @Date: 2022/10/17/19:27
 * @Description: 需要对某种数据类型进行判断，从而得到一个boolean值，这时可以使用Prediate接口 test方法
 */
public class Demo11Predicate_1 {
    public static void main(String[] args) {
        String s="abcdef";
        boolean b=method01(s,(s1)->{
            //对传递的字符串进行判断，判断字符串是否大于5
            return s1.length()>5;
        });
        System.out.println(b);

        //    优化=========================
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
