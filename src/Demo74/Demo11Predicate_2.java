package Demo74;

import java.util.function.Predicate;

/**
 * @Author: hsy
 * @Date: 2022/10/17/19:35
 * @Description:  Predicate and方法   == &&
 */
public class Demo11Predicate_2 {
    public static void main(String[] args) {
       String s="ABCDEFG";
        boolean b = method01(s, (s1) -> {
            return s1.contains("A");
        }, (s1) -> {
            return s1.length() > 5;
        });
        System.out.println(b);

//    优化================
        boolean b1 = method01(s, s1 -> s1.contains("b"), s1 -> s1.length() > 5);
        System.out.println(b1);

    }

    /**
     * @description 校验字符串
     * @param s:
     * @param predicate_1:
     * @param predicate_2:
     * @return boolean
     * @author hsy
     * @date 2022/10/17 19:43
     */
    protected static boolean method01(String s, Predicate<String> predicate_1, Predicate<String> predicate_2){
        //没有使用and方法  效果一样
//        return predicate_1.test(s) && predicate_2.test(s);

       //使用 and 方法
        return   predicate_1.and(predicate_2).test(s);
    }
}
